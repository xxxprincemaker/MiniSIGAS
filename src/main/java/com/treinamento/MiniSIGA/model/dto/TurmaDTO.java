package com.treinamento.MiniSIGA.model.dto;

import com.treinamento.MiniSIGA.model.entity.Turma;

public class TurmaDTO {

    public TurmaDTO(){
    }

    public TurmaDTO(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    private String nome;

    private String codigo;

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
}
