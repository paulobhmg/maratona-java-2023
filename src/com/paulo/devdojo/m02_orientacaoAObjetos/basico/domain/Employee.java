package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;
public class Employee extends Person {
    private double[] salaries;

    static {
        System.out.println("Inside static block from the Employee.");
    }

    {
        System.out.println("Inside normal block 1 from the employee.");
    }

    {
        System.out.println("Inside normal block 2 from the employee.");
    }
    public Employee(){
        super();
    }

    public Employee(String name, int age, char gender, double... salaries){
        super(name, age, gender);
        this.salaries = salaries;
        System.out.println("Employee constructor.");
    }

    public double averageCalculate() {
        double sum = 0;
        for(double salary : salaries) {
            sum += salary;
        }
        return sum / this.salaries.length;
    }

    public String showSalaries() {
        if(this.salaries == null || this.salaries.length == 0) {
            return "0";
        }
        StringBuilder salaries = new StringBuilder();
        for(double salary : this.salaries) {
            salaries.append(String.format("%.2f ", salary));
        }
        return salaries.toString();
    }

    public String toString(){
        return String.format("Employee: %s. \nLast tree salaries: %s.\nAvarage: %.2f\n", super.toString(), showSalaries(), averageCalculate());
    }
}
