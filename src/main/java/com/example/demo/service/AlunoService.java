package com.example.demo.service;

import com.example.demo.model.Aluno;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public Aluno criarAluno(String nome, String sala, int idade){
        return  new Aluno(nome,idade,sala);
    }
}
