package com.treinamento.MiniSIGA.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class CursoUFRJ extends AbstractEntity{

    private Date date;

    private String nome;

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
}
