package com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass.domain;
public abstract class Person {
    protected String name;
    protected int age;
    protected char gender;
    public Person(){}

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
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

    public String toString(){
        return (String.format("%s, %d years, gender: %c", name, age, gender));
    }
}
