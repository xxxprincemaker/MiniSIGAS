package com.treinamento.MiniSIGA.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Historico {

    @Id
    @GeneratedValue(generator = "gnosys-uuid")
    @GenericGenerator(name="gnosys-uuid", strategy = "uuid2")
    private String id;

    @Column(name = "cr_medio")
    private String crmedio;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrmedio() {
        return crmedio;
    }

    public void setCrmedio(String crmedio) {
        this.crmedio = crmedio;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
