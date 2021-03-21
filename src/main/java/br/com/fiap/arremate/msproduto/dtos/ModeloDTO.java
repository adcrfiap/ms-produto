package br.com.fiap.arremate.msproduto.dtos;

import br.com.fiap.arremate.msproduto.entities.Modelo;
import lombok.Data;

@Data
public class ModeloDTO {

    private Long id;

    private String nome;

    public static ModeloDTO converterParaDTO(Modelo modelo) {
        ModeloDTO modeloDTO = new ModeloDTO();
        modeloDTO.setId(modelo.getId());
        modeloDTO.setNome(modelo.getNome());
        return modeloDTO;
    }

    public Modelo converterParaEntidade() {
        Modelo modelo = new Modelo();
        modelo.setId(this.id);
        modelo.setNome(this.nome);
        return modelo;
    }
}
