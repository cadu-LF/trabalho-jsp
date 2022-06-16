package com.cadulf.trabalhojsb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadulf.trabalhojsb.dtos.FornecedorDTO;
import com.cadulf.trabalhojsb.dtos.ProdutoDTO;
import com.cadulf.trabalhojsb.services.ProdutoService;

@RestController
@RequestMapping(value = "produtos")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	
	@PutMapping
	public ProdutoDTO saveProduto(@RequestBody ProdutoDTO produto){
		ProdutoDTO produtoDTO = produtoService.saveProduto(produto);
		return produtoDTO;
	}
}
