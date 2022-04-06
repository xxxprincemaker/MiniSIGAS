package com.treinamento.MiniSIGA.controller;

import com.treinamento.MiniSIGA.model.entity.Turma;
import com.treinamento.MiniSIGA.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/turma")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @GetMapping(path = "/num/{numero}", produces = "application/json")
    public Turma getTurmaByNumero(@PathVariable String numero){
        return turmaService.getTurmaByNumero(numero);
    }

    @GetMapping(path = "/id/{id}")
    public Turma getTurmaById(@PathVariable String id){
        return turmaService.getTurmaById(id);
    }

    @PostMapping(path = "/cadastrar", consumes = "application/json", produces = "application/json")
    public Turma cadastrarTurma(@RequestBody Turma turma){
        return turmaService.cadastrar(turma);
    }

    @DeleteMapping(path = "/deletar/{id}")
    public void deletar(@PathVariable String id){
        turmaService.deletar(id);
    }
}
