package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.Person;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;

public abstract class Employee extends Person {
    protected double salary;
    public Employee(){
        super();
    }

    public Employee(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary){
        super(name, personTypeEnum, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("%s: %s, salary: %.2f", getClass().getSimpleName(), super.toString(), salary);
    }
}
