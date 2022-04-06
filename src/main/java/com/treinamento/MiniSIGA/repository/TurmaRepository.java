package com.treinamento.MiniSIGA.repository;

import com.treinamento.MiniSIGA.model.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, String> {
    Turma getTurmaByCodigo(String codigo);

    Turma getTurmaById(String id);
}
