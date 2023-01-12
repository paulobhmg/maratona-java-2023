package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public abstract class Calculadora {

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num2 > num1 ? num2 - num1 : num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Não é possível divisão por 0.");
            return 0;
        }
        return num1 / num2;
    }

    public static void imprimeDivisao(double num1, double num2){
        if(num2 == 0) {
            System.out.println("Não é permitido divisão por 0.");
        } else{
            System.out.printf("%.0f/%.0f=%.2f", num1, num2, num1/num2);
        }
    }
}
