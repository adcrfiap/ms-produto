package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.ModeloDTO;

import java.util.List;

public interface ModeloService {

    List<ModeloDTO> listarTodos();

    ModeloDTO pesquisarPorId(Long id);
}
