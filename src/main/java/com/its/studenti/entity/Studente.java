package com.its.studenti.entity;

public class Studente {

    private int id;
    private String nome;
    private String corso;

    public Studente() {

    }

    public Studente(int id, String nome, String corso) {
        this.id = id;
        this.nome = nome;
        this.corso = corso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorso() {
        return corso;
    }

    public void setCorso(String corso) {
        this.corso = corso;
    }
}
