package com.treinamento.MiniSIGA.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Turma", schema = "minisiga")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Turma {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String nome;

    private String codigo;

    @Column(name = "disciplina_id")
    private String disciplinaId;


    private String professor_1_id;

    private String professor_2_id;

    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(String disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getProfessor_1_id() {
        return professor_1_id;
    }

    public void setProfessor_1_id(String professor_1_id) {
        this.professor_1_id = professor_1_id;
    }

    public String getProfessor_2_id() {
        return professor_2_id;
    }

    public void setProfessor_2_id(String professor_2_id) {
        this.professor_2_id = professor_2_id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
