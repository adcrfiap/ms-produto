package br.com.fiap.arremate.msproduto.dtos;

import br.com.fiap.arremate.msproduto.entities.Marca;
import lombok.Data;

@Data
public class MarcaDTO {

    private Long id;

    private String nome;

    public static MarcaDTO converterParaDTO(Marca marca) {
        MarcaDTO marcaDTO = new MarcaDTO();
        marcaDTO.setId(marca.getId());
        marcaDTO.setNome(marca.getNome());
        return marcaDTO;
    }

    public Marca converterParaEntidade() {
        Marca marca = new Marca();
        marca.setId(this.id);
        marca.setNome(this.nome);
        return marca;
    }
}
