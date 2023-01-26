package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.School;
import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Teacher;

public class A66_Association {
    public static void main(String[] args) {
        Teacher javaTeacher = new Teacher("Juliano Gaspar", 50, 'M', "Java programming");
        Teacher mobileTeacher = new Teacher("Serufo", 45, 'M', "Mobile Development");

        School devdojo = new School("Devdojo");

        System.out.println(devdojo);
        System.out.println(javaTeacher);
        System.out.println(mobileTeacher);
        System.out.println("-----------------------------");

        devdojo.newTeacher(javaTeacher);
        devdojo.newTeacher(mobileTeacher);

        System.out.println(devdojo);
        System.out.println(javaTeacher);
        System.out.println(mobileTeacher);
        System.out.println("-----------------------------");

        devdojo.removeTeacher(javaTeacher);
        devdojo.removeTeacher(mobileTeacher);

        System.out.println(devdojo);
        System.out.println(javaTeacher);
        System.out.println(mobileTeacher);
    }
}
