package com.treinamento.MiniSIGA.model.dto;


import java.util.List;


public class AlunoDTO {

    private String cr;

    private String nome;

    private String dre;

    private List<TurmaDTO> turmasDTO;

    public AlunoDTO(){

    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDre() {
        return dre;
    }

    public void setDre(String dre) {
        this.dre = dre;
    }

    public List<TurmaDTO> getTurmasDTO() {
        return turmasDTO;
    }

    public void setTurmasDTO(List<TurmaDTO> turmasDTO) {
        this.turmasDTO = turmasDTO;
    }
}
