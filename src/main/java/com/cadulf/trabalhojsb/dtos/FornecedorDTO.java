package com.cadulf.dsfornecedor.dtos;

import com.cadulf.dsfornecedor.entities.Fornecedor;

public class FornecedorDTO {
	private Long id;
	private String nome;
	private String cnpj;
	
	public FornecedorDTO() {
		
	}

	public FornecedorDTO(Long id, String nome, String cnpj) {
	
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public FornecedorDTO(Fornecedor fornecedor) {
	
		this.id = fornecedor.getId();
		this.nome = fornecedor.getNome();
		this.cnpj = fornecedor.getCnpj();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
