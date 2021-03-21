package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.ModeloDTO;
import br.com.fiap.arremate.msproduto.repositories.ModeloRepository;
import br.com.fiap.arremate.msproduto.services.ModeloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ModeloServiceImpl implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Override
    public List<ModeloDTO> listarTodos() {
        return this.modeloRepository.findAll()
                .stream()
                .map(ModeloDTO::converterParaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ModeloDTO pesquisarPorId(Long id) {
        return this.modeloRepository.findById(id)
                .map(ModeloDTO::converterParaDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
