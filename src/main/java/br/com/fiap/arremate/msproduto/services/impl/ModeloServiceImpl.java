package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.ModeloDTO;
import br.com.fiap.arremate.msproduto.repositories.ModeloRepository;
import br.com.fiap.arremate.msproduto.services.ModeloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class ModeloServiceImpl implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Override
    public ModeloDTO pesquisarPorId(Long id) {
        return this.modeloRepository.findById(id)
                .map(ModeloDTO::converterParaDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
