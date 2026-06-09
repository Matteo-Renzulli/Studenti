package com.its.studenti.controller;

import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController // Indica che questa classe gestirà richieste HTTP e risponderà direttamente in formato JSON (API REST)
@RequestMapping("api/studenti") // Definisce l'URL di base per tutti gli endpoint di questa classe (es: http://localhost:8080/api/studenti)
public class StudenteController {

    // @Autowired attiva la Dependency Injection. Spring cerca un componente di tipo 'StudenteService'
    // (troverà StudenteServiceImpl perché annotato con @Service) e lo inietta automaticamente qui.
    @Autowired
    private StudenteService studenteService;

    // @GetMapping mappa le richieste HTTP GET.
    // L'URL finale per attivare questo metodo sarà: /api/studenti/elenco
    @GetMapping("/elenco")
    public List<Studente> getAll(){
        // Il controller non sa come vengano presi i dati (se da una lista o da un database).
        // Chiede semplicemente al servizio di fare il lavoro e ne restituisce il risultato.
        return studenteService.getAll();
    }

}
