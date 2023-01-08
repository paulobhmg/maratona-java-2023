package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Estudante extends Pessoa {
    Professor professor;
    public Estudante(){
        super();
    }

    public Estudante(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }
    public Estudante(String nome, int idade, char sexo, Professor professor) {
        super(nome, idade, sexo);
        this.professor = professor;
    }

    public String toString(){
        return String.format("Estudante: %s, \nProfessor: %s", super.toString(), getProfessor());
    }

    String getProfessor(){
        return professor != null ? professor.toString() : "Nenhum";
    }
}
