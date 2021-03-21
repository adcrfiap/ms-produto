package br.com.fiap.arremate.msproduto.dtos;

import br.com.fiap.arremate.msproduto.entities.Produto;
import lombok.Data;

@Data
public class ProdutoDTO {

    private Long id;

    private String nome;

    private CategoriaDTO categoria;

    private MarcaDTO marca;

    private ModeloDTO modelo;

    public static ProdutoDTO converterParaDTO(Produto produto) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setId(produto.getId());
        produtoDTO.setNome(produto.getNome());
        produtoDTO.setCategoria(CategoriaDTO.converterParaDTO(produto.getCategoria()));
        produtoDTO.setMarca(MarcaDTO.converterParaDTO(produto.getMarca()));
        produtoDTO.setModelo(ModeloDTO.converterParaDTO(produto.getModelo()));
        return produtoDTO;
    }

    public Produto converterParaEntidade() {
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setCategoria(this.categoria.converterParaEntidade());
        produto.setMarca(this.marca.converterParaEntidade());
        produto.setModelo(this.modelo.converterParaEntidade());
        return produto;
    }
}
