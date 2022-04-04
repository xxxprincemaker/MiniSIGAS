package com.treinamento.MiniSIGA.model.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Aluno", schema = "prince")
public class Aluno {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
    private UUID id;

    @Basic
    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf", updatable = false, nullable = false, unique = true, length = 11)
    private String cpf;

    @Basic
    @Column(name = "matriculaDRE")
    private String matriculaDre;

    @Basic
    @Column(name = "curso_id")
    private String cursoId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatriculaDre() {
        return matriculaDre;
    }

    public void setMatriculaDre(String matriculaDre) {
        this.matriculaDre = matriculaDre;
    }

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(matriculaDre, that.matriculaDre) && Objects.equals(cursoId, that.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, matriculaDre, cursoId);
    }
}
