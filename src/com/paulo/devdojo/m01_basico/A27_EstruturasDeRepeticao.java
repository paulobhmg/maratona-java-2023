package com.paulo.devdojo.m01_basico;

import java.util.Scanner;

/* Os laços de repetição são utilizados quando precisamos que o programa execute determinado trecho de código
   repetidas vezes. Existem 3 tipos de laços e cada um deles possui uma característica diferente. São eles:
   while, do while e for. */
public class A27_EstruturasDeRepeticao {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("LAÇO WHILE");

		/* Esse laço é executado enquanto uma condição for verdadeira e só será executado após testar a condição uma vez.
		   É importante observar que para que o laço seja finalizado, em algum momento a condição deve se tornar falsa.
		   Contadores numéricos devem ser incrementados para evitar que o laço entre em loop infinito. */

        int contador = 0;
        while(contador < 10) {
            System.out.print(contador);
            if(contador < 9) {
                System.out.print(", ");
            }
            contador ++;
        }
        System.out.println();
        System.out.println("----------------------");

        System.out.println("LAÇO DO WHILE");

		/* Diferente do laço anterior, este executará pelo menos uma vez, independente da condição ser verdadeira ou falsa.
		   O laço executa e só depois testa a condição. */

        contador = 0;
        do {
            System.out.print(contador);
            if(contador < 9) {
                System.out.print(", ");
            }
            contador ++;
        } while(contador < 10);
        System.out.println();
        System.out.println("----------------------");

        System.out.println("LAÇO FOR");

		/* Este laço é utilizado quando não há necessidade de controlar a condição do loop, por exemplo, quando é necessário percorrer uma lista inteira.
		   Para utilizar os laços anteriores é necessário a criação de uma variável de controle externa, que deverá ser alterada a cada iteração, a fim de evitar o loop infinito.
		   Já no laço for, as variáveis de controle, condição e incremento são especificadas em sua assinatura e a própria estrutura faz o controle das variáveis. */

        for(int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        System.out.print("INFORME UM NÚMERO PARA IMPRESSÃO DOS NÚMEROS PARES: ");
        int number = in.nextInt();
        int control = 1;

        for(int i = 0; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.print(i);
                if(control <= 80) {
                    System.out.print(",");
                    control++;
                }else {
                    control = 1;
                }
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }
}
