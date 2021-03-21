package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.CadastroProdutoDTO;
import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;
import br.com.fiap.arremate.msproduto.entities.Produto;
import br.com.fiap.arremate.msproduto.repositories.ProdutoRepository;
import br.com.fiap.arremate.msproduto.services.CategoriaService;
import br.com.fiap.arremate.msproduto.services.MarcaService;
import br.com.fiap.arremate.msproduto.services.ModeloService;
import br.com.fiap.arremate.msproduto.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final CategoriaService categoriaService;

    private final MarcaService marcaService;

    private final ModeloService modeloService;

    private final ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoDTO> listarTodos() {
        return this.produtoRepository.findAll()
                .stream()
                .map(ProdutoDTO::converterParaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProdutoDTO pesquisarPorId(Long id) {
        return this.produtoRepository.findById(id)
                .map(ProdutoDTO::converterParaDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public ProdutoDTO cadastrar(@RequestBody CadastroProdutoDTO cadastroProdutoDTO) {
        ProdutoDTO produtoDTO = cadastroProdutoDTO.converter(this.categoriaService, this.marcaService, this.modeloService);
        Produto produtoCadastrado = this.produtoRepository.save(produtoDTO.converterParaEntidade());
        return ProdutoDTO.converterParaDTO(produtoCadastrado);
    }

    @Override
    public void excluir(Long id) {
        if (this.produtoRepository.existsById(id)) {
            this.produtoRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
