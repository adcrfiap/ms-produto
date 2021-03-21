package br.com.fiap.arremate.msproduto.controllers;

import br.com.fiap.arremate.msproduto.dtos.MarcaDTO;
import br.com.fiap.arremate.msproduto.services.MarcaService;
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
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaService marcaService;

    @ApiOperation(value = "Retorna a lista de marcas")
    @GetMapping
    public ResponseEntity<List<MarcaDTO>> listarTodos() {
        return ResponseEntity.ok(this.marcaService.listarTodos());
    }

    @ApiOperation(value = "Pesquisa uma marca pelo seu ID")
    @GetMapping("/{id}")
    public ResponseEntity<MarcaDTO> pesquisarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.marcaService.pesquisarPorId(id));
    }
}
