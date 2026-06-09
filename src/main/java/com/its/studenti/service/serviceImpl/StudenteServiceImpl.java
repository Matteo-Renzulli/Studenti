package com.its.studenti.service.serviceImpl;


import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.stereotype.Service; // Importa l'annotazione di Spring

import java.util.ArrayList;
import java.util.List;

// @Service dice a Spring: "Questa è una componente di logica di business".
// Spring la creerà e la terrà pronta nel suo 'contesto' per essere usata (Dependency Injection).
@Service
public class StudenteServiceImpl implements StudenteService {

    // Lista in memoria che simula un Database temporaneo
    private List<Studente> studenti = new ArrayList<>();

    // Costruttore: viene eseguito all'avvio dell'applicazione.
    // Viene usato qui per popolare la lista con due studenti "finti" di test.
    public StudenteServiceImpl() {
        // Creazione del primo studente tramite costruttore vuoto + setter
        Studente studente = new Studente();
        studente.setId(1);
        studente.setNome("Prof");
        studente.setCorso("Spring-boot");
        studenti.add(studente);

        Studente studente2 = new Studente();
        studente2.setId(2);
        studente2.setNome("Antonio");
        studente2.setCorso("Spring-boot");
        studenti.add(studente2);
    }

    // @Override indica che stiamo adempiendo al contratto firmato con l'interfaccia StudenteService
    @Override
    public List<Studente> getAll() {
        return studenti; // Ritorna semplicemente la lista popolata nel costruttore
    }
}
