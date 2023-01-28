package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product;

public class Tablet extends Product {
    private double memory;
    public Tablet() {}
    public Tablet(String description, double price, double rate) {
        super(description, price, rate);
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
