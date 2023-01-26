package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Calculator;

import java.util.Scanner;

/* Na orientação a objetos, temos os atributos e os métodos.
   Os métodos são o comportamento da classe, ou seja, as funções que a classe executa, que ou não retornar valores.
   Quando um método não retorna nenhum valor, ele apenas executa uma ação e é finalizado.

   Os métodos podem possuir parâmetros, que devem ser passados como argumentos no momento de sua chamada.
 */
public class A045_Metodos {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Informe dois números para o cálculo: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        System.out.printf("Soma: %.0f+%.0f=%.0f\n", num1, num2, Calculator.soma(num1, num2));
        if (num1 > num2) {
            System.out.printf("Subtração: %.0f-%.0f=%.0f\n", num1, num2, Calculator.soma(num1, num2));
        } else {
            System.out.printf("Subtração: %.0f-%.0f=%.0f\n", num2, num1, Calculator.subtracao(num1, num2));
        }
        System.out.printf("Multiplicação: %.0fx%.0f=%.0f\n", num1, num2, Calculator.multiplicacao(num1, num2));
        System.out.printf("Divisão: %.0f/%.0f=%.2f\n", num1, num2, Calculator.divisao(num1, num2));

        Calculator.imprimeDivisao(num1, num2);
    }
}
