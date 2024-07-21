package com.tartarugacometa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tartarugacometa.entregas.Entrega;

public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
