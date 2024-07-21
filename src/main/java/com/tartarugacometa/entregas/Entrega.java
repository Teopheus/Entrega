package com.tartarugacometa.entregas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String remetenteCpfCnpj;
    private String remetenteNome;
    private String remetenteEndereco;
    private String destinatarioCpfCnpj;
    private String destinatarioNome;
    private String destinatarioEndereco;
    private String produtoNome;
    private double produtoPeso;
    private double produtoVolume;
    private double produtoValor;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemetenteCpfCnpj() {
        return remetenteCpfCnpj;
    }

    public void setRemetenteCpfCnpj(String remetenteCpfCnpj) {
        this.remetenteCpfCnpj = remetenteCpfCnpj;
    }

    public String getRemetenteNome() {
        return remetenteNome;
    }

    public void setRemetenteNome(String remetenteNome) {
        this.remetenteNome = remetenteNome;
    }

    public String getRemetenteEndereco() {
        return remetenteEndereco;
    }

    public void setRemetenteEndereco(String remetenteEndereco) {
        this.remetenteEndereco = remetenteEndereco;
    }

    public String getDestinatarioCpfCnpj() {
        return destinatarioCpfCnpj;
    }

    public void setDestinatarioCpfCnpj(String destinatarioCpfCnpj) {
        this.destinatarioCpfCnpj = destinatarioCpfCnpj;
    }

    public String getDestinatarioNome() {
        return destinatarioNome;
    }

    public void setDestinatarioNome(String destinatarioNome) {
        this.destinatarioNome = destinatarioNome;
    }

    public String getDestinatarioEndereco() {
        return destinatarioEndereco;
    }

    public void setDestinatarioEndereco(String destinatarioEndereco) {
        this.destinatarioEndereco = destinatarioEndereco;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoPeso() {
        return produtoPeso;
    }

    public void setProdutoPeso(double produtoPeso) {
        this.produtoPeso = produtoPeso;
    }

    public double getProdutoVolume() {
        return produtoVolume;
    }

    public void setProdutoVolume(double produtoVolume) {
        this.produtoVolume = produtoVolume;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }
}
