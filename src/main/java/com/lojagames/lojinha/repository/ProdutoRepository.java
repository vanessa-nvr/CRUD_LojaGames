package com.lojagames.lojinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.lojinha.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public List<ProdutoModel> findAllByProdutoContainingIgnoreCase(String produto);
}
