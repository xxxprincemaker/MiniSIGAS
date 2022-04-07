package com.treinamento.MiniSIGA.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Professor", schema = "minisiga")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Professor extends AbstractEntity{

    private String nome;

    private String cpf;

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
}
