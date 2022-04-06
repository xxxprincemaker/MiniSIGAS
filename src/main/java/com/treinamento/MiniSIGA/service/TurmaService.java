package com.treinamento.MiniSIGA.service;

import com.treinamento.MiniSIGA.model.entity.Turma;
import com.treinamento.MiniSIGA.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    public Turma getTurmaByNumero(String codigo){
        return turmaRepository.getTurmaByCodigo(codigo);
    }

    public Turma cadastrar(Turma turma){
        return turmaRepository.save(turma);
    }

    public Turma getTurmaById(String id){
        return turmaRepository.getTurmaById(id);
    }

    public void  deletar(String id){
        Turma turma = getTurmaById(id);
        turmaRepository.delete(turma);
    }
}
