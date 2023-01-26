package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

/* O varargs é uma forma simplificada de utilização de arrays. Com ele é possível passar como argumento vários
   valores, separados por vírgula, podendo iterar normalmente como se percorre um array.

   Há uma regra específica para o varargs: Ele deve ser o último parâmetro do método.
   Não é possível haver outro parâmetro depois do varargs, pois ele vai pegar todos os valores restantes, separando por vírgula.
 */
public class A52_Varargs {
    public static void main(String... args) {
        int calculo = calculaVarargs(10, 20, 30, 40, 50);
        System.out.println(calculo);
    }

    public static int calculaVarargs(int... numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }
}
