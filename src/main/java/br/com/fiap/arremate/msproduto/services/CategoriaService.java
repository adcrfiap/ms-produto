package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.CategoriaDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> listarTodos();

    CategoriaDTO pesquisarPorId(Long id);
}
