package br.com.fiap.arremate.msproduto.controllers;

import br.com.fiap.arremate.msproduto.dtos.CategoriaDTO;
import br.com.fiap.arremate.msproduto.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> listarTodos() {
        return ResponseEntity.ok(this.categoriaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> pesquisarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.categoriaService.pesquisarPorId(id));
    }
}
