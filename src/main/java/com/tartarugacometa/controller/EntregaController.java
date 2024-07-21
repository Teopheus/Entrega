package com.tartarugacometa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tartarugacometa.entregas.Entrega;
import com.tartarugacometa.repository.EntregaRepository;

@Controller
public class EntregaController {

    @Autowired
    private EntregaRepository entregaRepository;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/enviar-entrega")
    public String enviarEntrega(
        @RequestParam("remetente-cpf-cnpj") String remetenteCpfCnpj,
        @RequestParam("remetente-nome") String remetenteNome,
        @RequestParam("remetente-endereco") String remetenteEndereco,
        @RequestParam("destinatario-cpf-cnpj") String destinatarioCpfCnpj,
        @RequestParam("destinatario-nome") String destinatarioNome,
        @RequestParam("destinatario-endereco") String destinatarioEndereco,
        @RequestParam("produto-nome") String produtoNome,
        @RequestParam("produto-peso") double produtoPeso,
        @RequestParam("produto-volume") double produtoVolume,
        @RequestParam("produto-valor") double produtoValor,
        Model model) {

        // Criar nova entrega
        Entrega entrega = new Entrega();
        entrega.setRemetenteCpfCnpj(remetenteCpfCnpj);
        entrega.setRemetenteNome(remetenteNome);
        entrega.setRemetenteEndereco(remetenteEndereco);
        entrega.setDestinatarioCpfCnpj(destinatarioCpfCnpj);
        entrega.setDestinatarioNome(destinatarioNome);
        entrega.setDestinatarioEndereco(destinatarioEndereco);
        entrega.setProdutoNome(produtoNome);
        entrega.setProdutoPeso(produtoPeso);
        entrega.setProdutoVolume(produtoVolume);
        entrega.setProdutoValor(produtoValor);

        // Salvar entrega no repositório
        entregaRepository.save(entrega);

        // Adicionar mensagem de sucesso no modelo
        model.addAttribute("mensagem", "Entrega registrada com sucesso!");

        // Redirecionar para a página inicial com a mensagem
        return "index";
    }
}
