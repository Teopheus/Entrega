package com.tartarugacometa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tartarugacometa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
