package com.treinamento.MiniSIGA.service;

import com.treinamento.MiniSIGA.model.dto.AlunoDTO;
import com.treinamento.MiniSIGA.model.dto.TurmaDTO;
import com.treinamento.MiniSIGA.model.entity.Aluno;
import com.treinamento.MiniSIGA.model.entity.Turma;
import com.treinamento.MiniSIGA.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno getAlunoByCPF(String cpf){
        return alunoRepository.getAlunoByCpf(cpf);
    }

    public Aluno getAlunoById(String id){
        return alunoRepository.getAlunoById(id);
    }

    public AlunoDTO getAlunoDTO(String id){
        Aluno aluno = alunoRepository.getAlunoById(id);

        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setCr(aluno.getHistorico().getCrmedio());
        alunoDTO.setNome(aluno.getNome());
        alunoDTO.setDre(aluno.getMatriculaDre());

        List<TurmaDTO> turmaDTOS = new ArrayList<>();
        for(Turma turma : aluno.getTurmas()){
            TurmaDTO turmaDTO = new TurmaDTO(turma.getNome(), turma.getCodigo());
            turmaDTOS.add(turmaDTO);

        }

        alunoDTO.setTurmasDTO(turmaDTOS);

        return alunoDTO;
    }

    public Aluno cadastrar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno update(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @Transactional
    public void deletar(String matriculaDre){
        alunoRepository.deleteByMatriculaDre(matriculaDre);
    }

    @Transactional
    public void deletarAlunoByCPF(String cpf){
        alunoRepository.deleteByCpf(cpf);
    }

    public void deleteById(String id){
        Aluno aluno = alunoRepository.getAlunoById(id);
        alunoRepository.delete(aluno);
    }

    public void foo(){
        System.out.println("X");
    }
}
