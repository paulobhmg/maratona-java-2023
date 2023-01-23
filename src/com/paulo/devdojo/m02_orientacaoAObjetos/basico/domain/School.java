package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();

    public School() { }

    public School(String name) {
        this.name = name;
    }

    public boolean newTeacher(Teacher teacher) {
        if(teachers.contains(teacher)) {
            System.out.println("Teacher has been working in this school.");
            return false;
        }
        teacher.setSchool(this);
        return teachers.add(teacher);
    }

    public boolean removeTeacher(Teacher teacher) {
        teacher.setSchool(null);
        return teachers.remove(teacher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public String toString() {
        return String.format("School: %s\nTeachers: %s", name, showTeachers());
    }

    private String showTeachers() {
        StringBuilder teacherDescription = new StringBuilder();
        if(teachers.size() == 0) {
            return "There is not teachers in this school.";
        }
        for(Teacher teacher : teachers) {
            teacherDescription.append(String.format("[%s, speciality: %s], ", teacher.getName(), teacher.getSpeciality()));
        }
        return teacherDescription.toString();
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
