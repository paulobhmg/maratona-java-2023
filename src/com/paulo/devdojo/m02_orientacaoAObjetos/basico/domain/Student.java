package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Student extends Person {
    Teacher professor;
    public Student(){
        super();
    }

    public Student(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }
    public Student(String nome, int idade, char sexo, Teacher professor) {
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
