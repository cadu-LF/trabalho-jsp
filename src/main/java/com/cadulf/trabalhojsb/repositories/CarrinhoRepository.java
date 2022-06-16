package com.cadulf.trabalhojsb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulf.trabalhojsb.entities.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>{
	
	Carrinho findByUsername(String username);
}
