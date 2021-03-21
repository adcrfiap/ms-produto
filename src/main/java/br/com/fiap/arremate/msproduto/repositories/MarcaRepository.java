package br.com.fiap.arremate.msproduto.repositories;

import br.com.fiap.arremate.msproduto.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
