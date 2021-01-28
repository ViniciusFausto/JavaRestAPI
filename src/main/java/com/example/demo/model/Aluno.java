package com.example.demo.model;

public class Aluno {
    private String nome;
    private int idade;
    private String sala;

    public Aluno(String nome, int idade, String sala) {
        this.nome = nome;
        this.idade = idade;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
