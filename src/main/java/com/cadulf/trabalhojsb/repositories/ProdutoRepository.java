package com.cadulf.trabalhojsb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulf.trabalhojsb.entities.Produto;
import com.cadulf.trabalhojsb.entities.ProdutoPK;

public interface ProdutoRepository extends JpaRepository<Produto, ProdutoPK>{
	
}
