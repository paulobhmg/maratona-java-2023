package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    int ano;

    public Carro(){}
    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString(){
        return String.format("Marca: %s, modelo: %s, ano: %d, cor: %s", marca, modelo, ano, cor);
    }
}
