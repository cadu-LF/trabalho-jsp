package com.cadulf.trabalhojsb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadulf.trabalhojsb.dtos.FornecedorDTO;
import com.cadulf.trabalhojsb.services.FornecedorService;

@RestController
@RequestMapping(value = "fornecedores")
public class FornecedorController {

	@Autowired
	FornecedorService fornecedorService;
	
	@GetMapping
	public Page<FornecedorDTO> findAll(Pageable pageable){
		return fornecedorService.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public FornecedorDTO find(@PathVariable Long id){
		return fornecedorService.findById(id);
	}
}
