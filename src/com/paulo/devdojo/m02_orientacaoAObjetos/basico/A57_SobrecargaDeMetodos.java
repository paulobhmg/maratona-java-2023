package com.paulo.devdojo.m02_orientacaoAObjetos.basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Calculator;

/* A sobrecarga do método acontece quando precisamos executar uma mesma rotina, porém com número de parâmetros diferentes.
   Isso possibilita diversificar a construção de objetos ou expande o uso de seus métodos.

   Os métodos sobrecarregados normalmente executam a mesma tarefa, difenciando apenas em seu número de argumentos. */
public class A57_SobrecargaDeMetodos {
    public static void main(String[] args) {
        System.out.println("Novo cálculo: " + Calculator.novoCalculo(10, 20));
        System.out.println("Novo cálculo 1: " + Calculator.novoCalculo(10, 20, '+'));
        System.out.println("Novo cálculo 2: " + Calculator.novoCalculo(10, 20, '-'));
        System.out.println("Novo cálculo 3: " + Calculator.novoCalculo(10, 20, '*'));
        System.out.println("Novo cálculo 4: " + Calculator.novoCalculo(10, 20, '/'));
        System.out.println("Novo cálculo 5: " + Calculator.novoCalculo(10, 20, '1'));
    }
}
