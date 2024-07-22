package com.generation.PerformaceGoals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.PerformaceGoals.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllBynomeProdutoContainingIgnoreCase(String nomeProduto);
	

}
