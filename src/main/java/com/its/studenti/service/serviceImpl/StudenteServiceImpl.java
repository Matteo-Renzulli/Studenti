package com.its.studenti.service.serviceImpl;


import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudenteServiceImpl implements StudenteService {

    private List<Studente> studenti = new ArrayList<>();
    public StudenteServiceImpl() {
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

    @Override
    public List<Studente> getAll() {
        return studenti;
    }
}
