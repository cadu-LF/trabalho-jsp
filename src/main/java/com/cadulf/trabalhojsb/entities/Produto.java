package com.cadulf.trabalhojsb.entities;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

@Entity
@Table(name="tb_produto")
public class Produto {

	@EmbeddedId
	private ProdutoPK id = new ProdutoPK();
	
	private Double value;
	private String nome;

	public Produto() {
		
	}
	
	public Produto(ProdutoPK id, Double value, String nome) {
		super();
		this.id = id;
		this.value = value;
		this.nome = nome;
	}

	public ProdutoPK getId() {
		return id;
	}

	public void setId(ProdutoPK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		id.setFornecedor(fornecedor);
	}
	
	public void setCarrinho(Carrinho carrinho) {
		id.setCarrinho(carrinho);
	}
}
