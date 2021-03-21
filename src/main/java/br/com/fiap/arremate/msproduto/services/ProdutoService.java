package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.CadastroProdutoDTO;
import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;

import java.util.List;

public interface ProdutoService {

    ProdutoDTO cadastrar(CadastroProdutoDTO cadastroProdutoDTO);

    List<ProdutoDTO> listarTodos();

    ProdutoDTO pesquisarPorId(Long id);

    void excluir(Long id);
}
