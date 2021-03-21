package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.ModeloDTO;

public interface ModeloService {

    ModeloDTO pesquisarPorId(Long id);

}
