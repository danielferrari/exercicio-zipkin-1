package br.com.mastertech.usuario.dtos;

import java.util.HashMap;

public class Usuario {
    private Long id;
    private String nome;
    private HashMap<String, Object> cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, Object> getCep() {
        return cep;
    }

    public void setCep(HashMap<String, Object> cep) {
        this.cep = cep;
    }
}
