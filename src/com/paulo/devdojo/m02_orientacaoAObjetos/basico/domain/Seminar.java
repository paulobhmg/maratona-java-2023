package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String title;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();
    private Local local;

    public Seminar() {}

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Teacher teacher, List<Student> students, Local local) {
        this(title, local);
        this.students = students;
        this.teacher = teacher;
    }

    public boolean addStudent(Student student) {
        return student.add(this) && students.add(student);
    }

    public boolean removeStudent(Student student) {
        return student.remove(this) && students.remove(student);
    }
    public String toString() {
        return String.format("Seminar: %s, %s\nStudents: %s\nLocal: %s", title, (teacher == null ? "Undefined" : teacher), showStudents(), local);
    }

    public String showStudents() {
        if(students.size() == 0) return "There is not students for this seminar.";
        StringBuilder studentDescription = new StringBuilder();
        for(Student student : students) {
            studentDescription.append(String.format("%s, ", student.getName()));
        }
        return studentDescription.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
