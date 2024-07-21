package com.tartarugacometa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tartarugacometa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
