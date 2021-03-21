package br.com.fiap.arremate.msproduto.repositories;

import br.com.fiap.arremate.msproduto.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
