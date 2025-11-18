package io.github.cannudo.produtosapi.repository;

import io.github.cannudo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    
}
