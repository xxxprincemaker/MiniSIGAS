package com.treinamento.MiniSIGA.service;

import com.treinamento.MiniSIGA.model.entity.Professor;
import com.treinamento.MiniSIGA.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor getProfessorById(String id){
        return professorRepository.getProfessorById(id);
    }

}
