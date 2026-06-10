package com.its.studenti.service;

import com.its.studenti.entity.Studente; // Importa l'entità Studente per poterla usare

import java.util.List;

public interface StudenteService {

    // Dichiarazione del metodo: chi implementerà questa interfaccia DOVRÀ scrivere il codice
    // per restituire una lista di studenti.
    List<Studente> getAll();

    String create(Studente studente);
}
