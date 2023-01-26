package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.*;

public class A70_AssociationExercise {
    public static void main(String[] args) {
        Student student1 = new Student("Paulo", 30, 'M');
        Student student2 = new Student("Nathan", 27, 'M');

        Local local1 = new Local("Devdojo academy", "Holanda");
        Local local2 = new Local("Digital Inovation", "Brasil");

        Teacher java =  new Teacher("Willian Suane", 36, 'M', "Java development");
        Teacher react = new Teacher("Diego Fernandes", 23, 'M', "React development");

        Seminar javaSeminar = new Seminar("Maratona Java Virado no Jiraya", local1);
        Seminar reactSeminar = new Seminar("Oministack React", local2);

        javaSeminar.addStudent(student1);
        javaSeminar.addStudent(student2);
        reactSeminar.addStudent(student1);
        reactSeminar.addStudent(student2);

        javaSeminar.setTeacher(java);
        reactSeminar.setTeacher(react);

        System.out.println(local1);
        System.out.println(local2);
        System.out.println("----------------------------");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("----------------------------");

        System.out.println(java);
        System.out.println(react);
        System.out.println("----------------------------");

        System.out.println(javaSeminar);
        System.out.println(reactSeminar);
        System.out.println("---------------------------");

        javaSeminar.removeStudent(student1);
        javaSeminar.removeStudent(student2);

        reactSeminar.removeStudent(student1);
        reactSeminar.removeStudent(student2);

        System.out.println(javaSeminar);
        System.out.println(student1);
        System.out.println(student2);
    }
}
