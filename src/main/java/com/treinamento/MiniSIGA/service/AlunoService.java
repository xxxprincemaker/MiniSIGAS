package com.treinamento.MiniSIGA.service;

import com.treinamento.MiniSIGA.model.entity.Aluno;
import com.treinamento.MiniSIGA.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno getAlunoByCPF(String cpf){
        return alunoRepository.getAlunoByCpf(cpf);
    }

    public List<Aluno> getAlunos(){
        return alunoRepository.findAll();
    }

    public Aluno cadastrar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno update(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @Transactional
    public void deletar(String matriculaDre){
        alunoRepository.deleteByMatriculaDre(matriculaDre);
    }

    @Transactional
    public void deletarAlunoByCPF(String cpf){
        alunoRepository.deleteByCpf(cpf);
    }

    public void foo(){
        System.out.println("X");
    }
}
