package com.treinamento.MiniSIGA.repository;

import com.treinamento.MiniSIGA.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, String> {

    @Query("""
        select p from Professor p
        where p.id = :id
    """)
    Professor getProfessorById(String id);

}
