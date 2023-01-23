package com.paulo.devdojo.m02_orientacaoAObjetos.basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Person;

/* Existem dois tipos de passagem de parâmetros: passagem por valor e passagem por referência.
   Quando passamos tipos primitivos como argumento para métodos, enviamos uma cópia do valor, que será utilizado dentro do método e não
   afeta o valor original.

   Quando trabalhamos com tipos reference, enviamos o endereço de memória em que o objeto está. Ou seja, o método vai utilizar a mesma referência
   em memória e todas as alterações efetuadas dentro do método refletirão no objeto utilizado.

   Uma boa prática de programação quando trabalhamos com passagem por referência é não alterar o objeto original.
   Caso seja necessário executar alguma alteração, cria um novo objeto dentro do método e o retorna, com as devidas alterações.
 */
public class A48_PassagemDeParametros {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 13;
        System.out.println("Testando passagem de parâmetro por valor: ");
        testaPassagemPorValor(num1, num2);
        System.out.println("Fora do método: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("----------------------------------------\n");

        System.out.println("Testando passagem de parâmetro por referência: ");
        Person p1 = new Person("Paulo", 30, 'M');
        Person p2 = new Person("Nadille", 24, 'F');

        System.out.println("P1 antes do método: " + p1);
        System.out.println("P2 antes do método: " + p2);
        System.out.println("");

        testaPassagemPorReferencia(p1);
        testaPassagemPorReferencia(p2);
        System.out.println("");

        System.out.println("P1 depois do método" + p1);
        System.out.println("P2 depois do método" + p2);
    }

    // Os valores de num1 e num2 são alterados dentro do método, mas vamos perceber que ele não refletirá na variável externa.
    public static void testaPassagemPorValor(int num1, int num2) {
        num1 = 100;
        num2 = 300;
        System.out.printf("Dentro do método: num1 = %d, num2 = %d.\n", num1, num2);
    }

    // Já na passagem por referência, ao alterar um atributo da referência, o valor será alterado também no objeto original.
    public static void testaPassagemPorReferencia(Person pessoa) {
        pessoa.setIdade(50);
        System.out.printf("Dentro do método: %s\n", pessoa);
    }
}
