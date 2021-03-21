package br.com.fiap.arremate.msproduto.dtos;

import br.com.fiap.arremate.msproduto.entities.Categoria;
import lombok.Data;

@Data
public class CategoriaDTO {

    private Long id;

    private String nome;

    public static CategoriaDTO converterParaDTO(Categoria categoria) {
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setId(categoria.getId());
        categoriaDTO.setNome(categoria.getNome());
        return categoriaDTO;
    }

    public Categoria converterParaEntidade() {
        Categoria categoria = new Categoria();
        categoria.setId(this.id);
        categoria.setNome(this.nome);
        return categoria;
    }
}
