package br.com.fiap.arremate.msproduto.controllers;

import br.com.fiap.arremate.msproduto.dtos.CadastroProdutoDTO;
import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;
import br.com.fiap.arremate.msproduto.services.ProdutoService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @ApiOperation(value = "Retorna a lista de produtos")
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        return ResponseEntity.ok(this.produtoService.listarTodos());
    }

    @ApiOperation(value = "Pesquisa um produto pelo seu ID")
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> pesquisarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.produtoService.pesquisarPorId(id));
    }

    @ApiOperation(value = "Cadastra um produto")
    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrar(@RequestBody CadastroProdutoDTO cadastroProdutoDTO) {
        ProdutoDTO produtoCadastrado = this.produtoService.cadastrar(cadastroProdutoDTO);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produtoCadastrado.getId())
                .toUri();

        return ResponseEntity.created(uri)
                .body(produtoCadastrado);
    }

    @ApiOperation(value = "Exclui um produto")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        this.produtoService.excluir(id);
        return ResponseEntity.noContent()
                .build();
    }
}
