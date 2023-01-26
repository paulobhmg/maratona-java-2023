package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Seminar> seminaries = new ArrayList<>();

    public Student() {
        super();
    }

    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }

    public Student(String name, int age, char gender, List<Seminar> seminaries) {
        super(name, age, gender);
        this.seminaries = seminaries;
    }

    public boolean add(Seminar seminar) {
        if(seminaries.contains(seminar)) {
            System.out.println("This student is already on the seminar.");
            return false;
        }
        return seminaries.add(seminar);
    }

    public boolean remove(Seminar seminar) {
        if(!seminaries.contains(seminar)) {
            System.out.println("This student is not watching this seminar.");
            return false;
        }
        return seminaries.remove(seminar);
    }
    public String toString() {
        return String.format("Student: %s, \nSeminaries: %s", super.toString(), listSeminaries());
    }

    public List<Seminar> getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(List<Seminar> seminaries) {
        this.seminaries = seminaries;
    }

    public String listSeminaries() {
        if (seminaries.size() == 0) return "This student haven't seminaries to watch.";
        StringBuilder seminariesDescription = new StringBuilder();
        for (Seminar seminar : seminaries) {
            seminariesDescription.append(
                    String.format("\n%s, teacher: %s, Local: %s", seminar.getTitle(), (seminar.getTeacher() == null ? "Undefined" : seminar.getTeacher().getName()), seminar.getLocal().getAddress())
            );
        }
        return seminariesDescription.toString();
    }
}
