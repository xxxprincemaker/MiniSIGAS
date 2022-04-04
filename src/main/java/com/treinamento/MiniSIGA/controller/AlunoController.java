package com.treinamento.MiniSIGA.controller;

import com.treinamento.MiniSIGA.model.entity.Aluno;
import com.treinamento.MiniSIGA.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    //Create
    @PostMapping(path = "/cadastrar", consumes = "application/json")
    public Aluno cadastrar(@RequestBody Aluno aluno){
        return alunoService.cadastrar(aluno);
    }

    //Read
    @GetMapping(path = "/cpf/{cpf}", produces = "application/json")
    public Aluno getAlunoByCPF(@PathVariable String cpf){
        return alunoService.getAlunoByCPF(cpf);
    }

    //update (PUT)
    @PutMapping(path = "/atualizar", consumes = "application/json")
    public Aluno update(@RequestBody Aluno aluno){
        return alunoService.update(aluno);
    }

    //DELETE
    @DeleteMapping(path = "/deletar/{cpf}")
    public void deletar(@PathVariable String cpf){
        alunoService.deletarAlunoByCPF(cpf);
    }
}
