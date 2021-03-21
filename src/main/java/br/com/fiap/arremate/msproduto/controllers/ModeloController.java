package br.com.fiap.arremate.msproduto.controllers;

import br.com.fiap.arremate.msproduto.dtos.ModeloDTO;
import br.com.fiap.arremate.msproduto.services.ModeloService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/modelos")
public class ModeloController {

    private final ModeloService modeloService;

    @ApiOperation(value = "Retorna a lista de modelos")
    @GetMapping
    public ResponseEntity<List<ModeloDTO>> listarTodos() {
        return ResponseEntity.ok(this.modeloService.listarTodos());
    }

    @ApiOperation(value = "Pesquisa um modelo pelo seu ID")
    @GetMapping("/{id}")
    public ResponseEntity<ModeloDTO> pesquisarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.modeloService.pesquisarPorId(id));
    }
}
