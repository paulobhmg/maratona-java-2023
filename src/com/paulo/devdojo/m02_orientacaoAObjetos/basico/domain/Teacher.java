package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Teacher extends Person {
    String especialidade;

    public Teacher(){
        super();
    }

    public Teacher(String nome, int idade, char sexo, String especialidade) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
    }

    public String toString(){
        return String.format("Professor: %s, especialidade: %s", super.toString(), especialidade);
    }
}
