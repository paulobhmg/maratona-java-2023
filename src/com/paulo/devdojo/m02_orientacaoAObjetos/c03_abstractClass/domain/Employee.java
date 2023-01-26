package com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass.domain;

public abstract class Employee extends Person {
    protected double salary;
    public Employee(){
        super();
    }

    public Employee(String name, int age, char gender, double salary){
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract double commissionCalc();
    public String toString() {
        return String.format("Employee: %s, salary: %.2f, commission: %.2f", super.toString(), salary, commissionCalc());
    }
}
