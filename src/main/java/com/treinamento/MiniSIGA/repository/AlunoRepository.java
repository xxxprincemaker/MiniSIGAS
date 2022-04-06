package com.treinamento.MiniSIGA.repository;

import com.treinamento.MiniSIGA.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {

    Aluno getAlunoByCpf(String cpf);

    void deleteByMatriculaDre(String matriculaDre);

    void deleteByCpf(String cpf);

    void deleteAlunoById(String id);

    Aluno getAlunoById(String s);
}
