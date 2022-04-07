package com.treinamento.MiniSIGA.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Aluno", schema = "minisiga")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Aluno extends AbstractEntity{

    @Column(name = "nome")
    private String nome;

    @Length(min = 11, max = 11)
    @Column(name = "cpf")
    private String cpf;

    @Column(name = "matriculaDRE")
    private String matriculaDre;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoUFRJ curso;

    @ManyToMany
    @JoinTable(name = "AlunoTurma", joinColumns = @JoinColumn(name = "aluno_id"),
    inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private List<Turma> turmas;

    @OneToOne(mappedBy = "aluno")
    private Historico historico;

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public CursoUFRJ getCurso() {
        return curso;
    }

    public void setCurso(CursoUFRJ curso) {
        this.curso = curso;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(matriculaDre, that.matriculaDre) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, matriculaDre, curso);
    }
}
