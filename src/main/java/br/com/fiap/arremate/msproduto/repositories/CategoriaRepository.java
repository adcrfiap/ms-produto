package br.com.fiap.arremate.msproduto.repositories;

import br.com.fiap.arremate.msproduto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
