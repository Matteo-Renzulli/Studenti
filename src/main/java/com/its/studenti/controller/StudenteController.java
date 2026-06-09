package com.its.studenti.controller;

import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/studenti")
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @GetMapping("/elenco")
    public List<Studente> getAll(){
        return studenteService.getAll();
    }

}
