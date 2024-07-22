package com.generation.PerformaceGoals.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import com.generation.PerformaceGoals.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllBynomeCategoriaContainingIgnoreCase(@Param("nomeCategoria")String nomeCategoria);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);

}
