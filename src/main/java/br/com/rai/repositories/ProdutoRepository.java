package br.com.rai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rai.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
