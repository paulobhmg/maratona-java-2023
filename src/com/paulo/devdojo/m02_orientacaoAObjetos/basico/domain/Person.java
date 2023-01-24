package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;
public class Person {
    protected String name;
    protected int age;
    protected char gender;

    static {
        System.out.println("Inside static block from the Person.");
    }

    {
        System.out.println("Inside normal block 1 from the person.");
    }

    {
        System.out.println("Inside normal block 2 from the person.");
    }
    public Person(){}

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Person constructor.");
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
