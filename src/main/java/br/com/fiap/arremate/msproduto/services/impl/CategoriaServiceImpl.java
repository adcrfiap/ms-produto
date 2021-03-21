package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.CategoriaDTO;
import br.com.fiap.arremate.msproduto.repositories.CategoriaRepository;
import br.com.fiap.arremate.msproduto.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> listarTodos() {
        return this.categoriaRepository.findAll()
                .stream()
                .map(CategoriaDTO::converterParaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaDTO pesquisarPorId(Long id) {
        return this.categoriaRepository.findById(id)
                .map(CategoriaDTO::converterParaDTO)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
