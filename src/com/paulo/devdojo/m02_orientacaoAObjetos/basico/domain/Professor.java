package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Professor extends Pessoa{
    String especialidade;

    public Professor(){
        super();
    }

    public Professor(String nome, int idade, char sexo, String especialidade) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
    }

    public String toString(){
        return String.format("Professor: %s, especialidade: %s", super.toString(), especialidade);
    }
}
