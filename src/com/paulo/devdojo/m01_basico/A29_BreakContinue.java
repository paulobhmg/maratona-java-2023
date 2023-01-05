package com.paulo.devdojo.m01_basico;

import java.util.Scanner;

/* Quando trabalhamos com laços de repetição, há situações em que não basta apenas utilizar comandos IF para testar uma iteração, pois mesmo em
   uma execução onde só se quer imprimir determinada quantidade de números, por exemplo, o laço é executado até o final, consumindo memória e processamento.
   Para evitar isso é necessário interromper ou até mesmo pular determinada iteração, de acordo com alguma regra específica, utilizando os comandos BREAK ou CONTINUE.
*/
public class A29_BreakContinue {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PARANDO LAÇO COM BREAK");
        System.out.print("Informe um número para o laço: ");
        int number = in.nextInt();

        for(int i = 1; i <= number; i++) {
            System.out.print(i);
            if(i < 50) {
                System.out.print(",");
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println("-----------------------------\n");

        System.out.println("CALCULANDO FINANCIAMENTO COM BREAK");

        // O break interrompe o laço, fazendo com que a execução pare.

        System.out.print("Informe um valor para financiamento: ");
        double valorTotal = in.nextDouble();
        double valorDaParcela = 0;

        for(int numeroDeParcelas = 1; valorDaParcela <= valorTotal; numeroDeParcelas++) {
            valorDaParcela = valorTotal / numeroDeParcelas;
            if(valorDaParcela < 1000) {
                break;
            }
            System.out.printf("%d x %.2f\n", numeroDeParcelas, valorDaParcela);
        }
        System.out.println("------------------------------------\n");


        System.out.println("CALCULANDO FINANCIAMENTO COM CONTINUE");

        // O continue faz com que o laço pule para a próxima iteração, ignorando as linhas abaixo dele.

        System.out.print("Informe um valor para financiamento: ");
        valorTotal = in.nextDouble();

        for(int numParcelas = (int) valorTotal; numParcelas > 0; numParcelas--) {
            valorDaParcela = valorTotal / numParcelas;
            if(valorDaParcela < 1000) {
                continue;
            }
            System.out.printf("%d x %.2f\n", numParcelas, valorDaParcela);
        }
    }
}