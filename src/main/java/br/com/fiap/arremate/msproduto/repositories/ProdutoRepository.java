package br.com.fiap.arremate.msproduto.repositories;

import br.com.fiap.arremate.msproduto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
