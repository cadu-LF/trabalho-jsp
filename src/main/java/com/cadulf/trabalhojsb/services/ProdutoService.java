package com.cadulf.trabalhojsb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cadulf.trabalhojsb.dtos.ProdutoDTO;
import com.cadulf.trabalhojsb.entities.Fornecedor;
import com.cadulf.trabalhojsb.entities.Produto;
import com.cadulf.trabalhojsb.entities.Carrinho;
import com.cadulf.trabalhojsb.repositories.FornecedorRepository;
import com.cadulf.trabalhojsb.repositories.ProdutoRepository;
import com.cadulf.trabalhojsb.repositories.CarrinhoRepository;

@Service
public class ProdutoService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@Transactional
	public ProdutoDTO saveProduto(ProdutoDTO dto){
		
			Carrinho carrinho = carrinhoRepository.findByUsername(null);
			if (carrinho == null) {
				carrinho = new Carrinho();
				carrinho.setId(dto.getCarrinhoId());
				carrinhoRepository.saveAndFlush(carrinho);
			}
			
			Fornecedor fornecedor = fornecedorRepository.findById(dto.getFornecedorId()).get();
			
			Produto produto = new Produto();
			produto.setFornecedor(fornecedor);
			produto.setCarrinho(carrinho);
			produto.setValue(dto.getProduto());
			
			produto = produtoRepository.saveAndFlush(produto);
			
			double sum = 0;
			for(Produto x: carrinho.getProdutos()) {
				sum += x.getValue();
			}
			
			carrinho.setTotal(sum);
			carrinhoRepository.save(carrinho);
			fornecedor = fornecedorRepository.save(fornecedor);
			
			return new ProdutoDTO(produto);
		}
}
