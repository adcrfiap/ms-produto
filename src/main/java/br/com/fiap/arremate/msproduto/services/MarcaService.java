package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.MarcaDTO;

import java.util.List;

public interface MarcaService {

    List<MarcaDTO> listarTodos();

    MarcaDTO pesquisarPorId(Long id);
}
