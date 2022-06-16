package com.cadulf.trabalhojsb.dtos;

import com.cadulf.dsfornecedor.entities.Produto;

public class ProdutoDTO {

	private Long fornecedorId;
	private String carrinhoId;
	private Produto produto;
	
	public ProdutoDTO() {
		
	}

	public Long getFornecedorId() {
		return fornecedorId;
	}

	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}

	public String getCarrinhoId() {
		return carrinhoId;
	}

	public void setCarrinhoId(String carrinhoId) {
		this.carrinhoId = carrinhoId;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
