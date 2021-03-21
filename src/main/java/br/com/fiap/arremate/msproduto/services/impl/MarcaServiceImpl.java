package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.MarcaDTO;
import br.com.fiap.arremate.msproduto.repositories.MarcaRepository;
import br.com.fiap.arremate.msproduto.services.MarcaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    @Override
    public List<MarcaDTO> listarTodos() {
        return this.marcaRepository.findAll()
                .stream()
                .map(MarcaDTO::converterParaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MarcaDTO pesquisarPorId(Long id) {
        return this.marcaRepository.findById(id)
                .map(MarcaDTO::converterParaDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
