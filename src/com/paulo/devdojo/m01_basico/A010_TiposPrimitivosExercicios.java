package com.paulo.devdojo.m01_basico;

import java.util.Scanner;

public class A010_TiposPrimitivosExercicios {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nome: ");
        String name = in.nextLine();

        System.out.print("Idade: ");
        int age = in.nextByte();

        System.out.print("Salario:");
        double salry = in.nextDouble();

        System.out.print("Money:");
        double money = in.nextDouble();

        in.nextLine();
        System.out.print("Profissão: ");
        String job = in.nextLine();

        System.out.printf("Hello, %s! Welcome to Java development world! You are %d years old and you are a %s.\n", name, age, job);
    }
}
