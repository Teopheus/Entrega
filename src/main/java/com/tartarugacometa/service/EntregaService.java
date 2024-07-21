package com.tartarugacometa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tartarugacometa.entregas.Entrega;
import com.tartarugacometa.repository.EntregaRepository;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public Entrega salvar(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    public List<Entrega> listarTodas() {
        return entregaRepository.findAll();
    }

    // Outros métodos conforme necessário
}
