package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService aluno;
    @GetMapping
    public Aluno getAluno(){
        return aluno.criarAluno("Vinicius","3c",18);
    }
    @GetMapping("/{nome}")
    public ResponseEntity<Aluno> getAlunoByName(@PathVariable String nome){
        return ResponseEntity.ok(aluno.criarAluno(nome,"3c",18));
    }
    @GetMapping("/teste/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable int id){
        return ResponseEntity.ok(aluno.criarAluno("aaa","22",id));
    }
}
