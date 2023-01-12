package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;
public class Funcionario extends Pessoa{
    private double[] salarios;

    public Funcionario(){
        super();
    }

    public Funcionario(String nome, int idade, char sexo, double... salarios){
        super(nome, idade, sexo);
        this.salarios = salarios;
    }

    public double calculaMediaSalario() {
        double soma = 0;
        for(double salario : salarios) {
            soma += salario;
        }
        return soma / this.salarios.length;
    }

    public String listaSalarios() {
        if(this.salarios == null || this.salarios.length == 0) {
            return "0";
        }
        StringBuilder salarios = new StringBuilder();
        for(double salario : this.salarios) {
            salarios.append(String.format("%.2f ", salario));
        }
        return salarios.toString();
    }

    public String toString(){
        return String.format("Funcionário: %s. \nÚltimos três salários: %s.\nMédia: %.2f\n", super.toString(), listaSalarios(), calculaMediaSalario());
    }
}
