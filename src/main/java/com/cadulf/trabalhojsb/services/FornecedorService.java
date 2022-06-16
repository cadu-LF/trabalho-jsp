package com.cadulf.trabalhojsb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cadulf.trabalhojsb.dtos.FornecedorDTO;
import com.cadulf.trabalhojsb.entities.Fornecedor;
import com.cadulf.trabalhojsb.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Transactional(readOnly = true)
	public Page<FornecedorDTO> findAll(Pageable pageabale){
		Page<Fornecedor> fornecedores = fornecedorRepository.findAll(pageabale);
		Page<FornecedorDTO> fornecedorPages = fornecedores.map(x -> new FornecedorDTO(x));
		return fornecedorPages;
	}
	
	@Transactional(readOnly = true)
	public FornecedorDTO findById(Long id){
		Fornecedor fornecedor = fornecedorRepository.findById(id).get();
		FornecedorDTO fornecedorDTO = new FornecedorDTO(fornecedor);
		return fornecedorDTO;
	}
	
}
