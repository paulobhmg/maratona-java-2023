package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;

public class Waiter extends Seller {
    public Waiter() {super();}
    public Waiter(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary) {
        super(name, personTypeEnum, age, gender, salary);
    }
    public Waiter(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary, double commission) {
        super(name, personTypeEnum, age, gender, salary);
        this.commission = commission;
    }
}
