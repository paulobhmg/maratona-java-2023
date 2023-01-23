package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;
public class Person {
    protected String nome;
    protected int idade;
    protected char sexo;
    public Person(){}

    public Person(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String toString(){
        return (String.format("%s, %d anos, sexo: %c", nome, idade, sexo));
    }
}
