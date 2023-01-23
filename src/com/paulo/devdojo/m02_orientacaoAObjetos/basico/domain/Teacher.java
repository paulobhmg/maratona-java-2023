package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Teacher extends Person {
    String speciality;
    School school;

    public Teacher(){
        super();
    }

    public Teacher(String nome, int idade, char sexo, String speciality) {
        super(nome, idade, sexo);
        this.speciality = speciality;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toString(){
        return String.format("Teacher: %s, speciality: %s, school: %s", super.toString(), speciality, (school == null? "Nothing" : school.getName()));
    }
}
