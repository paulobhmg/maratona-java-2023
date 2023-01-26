package com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass.domain;

public class Manager extends Employee {
    public Manager() {
        super();
    }
    public Manager(String name, int age, char gender, double salary) {
        super(name, age, gender, salary);
    }
    @Override
    public double commissionCalc() {
        return this.salary * 0.06;
    }
}
