package com.treinamento.MiniSIGA.controller;

import com.treinamento.MiniSIGA.model.entity.Professor;
import com.treinamento.MiniSIGA.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping(path = "/id/{id}", produces = "application/json")
    public Professor getProfessor(@PathVariable String id) {
        return professorService.getProfessorById(id);
    }
}
