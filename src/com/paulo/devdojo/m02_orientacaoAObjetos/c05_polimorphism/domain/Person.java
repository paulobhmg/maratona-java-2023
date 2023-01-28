package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;

public abstract class Person {
    protected String name;
    protected int age;
    protected char gender;
    protected PersonTypeEnum personTypeEnum;

    public Person() {}

    public Person(String name, PersonTypeEnum personTypeEnum, int age, char gender) {
        this.name = name;
        this.personTypeEnum = personTypeEnum;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public PersonTypeEnum getPersonTypeEnum() {
        return personTypeEnum;
    }

    public void setPersonTypeEnum(PersonTypeEnum personTypeEnum) {
        this.personTypeEnum = personTypeEnum;
    }

    public String toString() {
        return (String.format("%s - %s, %d years, gender: %c", name, personTypeEnum.getDescription(), age, gender));
    }
}
