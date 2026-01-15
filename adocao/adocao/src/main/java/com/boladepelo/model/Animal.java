package com.boladepelo.model;


import jakarta.persistence.*;


@Entity
public class Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String idade;
    private String descricao;
    private Boolean adotado = false;
    private String fotoUrl;
    private String ong;
    private String contato;


// Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}