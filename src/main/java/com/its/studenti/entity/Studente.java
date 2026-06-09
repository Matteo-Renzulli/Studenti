package com.its.studenti.entity;

public class Studente {

    // Attributi privati (incapsulamento): visibili solo all'interno di questa classe
    private int id;
    private String nome;
    private String corso;

    // Costruttore vuoto (di default): fondamentale per molti framework come Spring/Hibernate
    public Studente() {

    }

    // Costruttore con parametri: permette di creare un oggetto Studente passando subito i dati
    public Studente(int id, String nome, String corso) {
        this.id = id;
        this.nome = nome;
        this.corso = corso;
    }

    // --- METODI GETTER E SETTER ---
    // Consentono di leggere (Get) e modificare (Set) le variabili private dall'esterno

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
