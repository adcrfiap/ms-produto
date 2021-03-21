package br.com.fiap.arremate.msproduto.dtos;

import br.com.fiap.arremate.msproduto.services.CategoriaService;
import br.com.fiap.arremate.msproduto.services.MarcaService;
import br.com.fiap.arremate.msproduto.services.ModeloService;
import lombok.Data;

@Data
public class CadastroProdutoDTO {

    private String nome;

    private Long idCategoria;

    private Long idMarca;

    private Long idModelo;

    public ProdutoDTO converter(CategoriaService categoriaService, MarcaService marcaService, ModeloService modeloService) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setNome(this.nome);
        produtoDTO.setCategoria(categoriaService.pesquisarPorId(this.idCategoria));
        produtoDTO.setMarca(marcaService.pesquisarPorId(this.idMarca));
        produtoDTO.setModelo(modeloService.pesquisarPorId(this.idModelo));

        return produtoDTO;
    }
}
