package com.paulo.devdojo.m01_basico;

/* As operações no Java são feitas a partir de operações aritméticas, relacionais e lógicas.
   Operadores aritméticos: + - * / %
   Operadores relacionais: < > <= >= == !=
   Operadores lógicos: && ||
   Operadores de atribuição: = += -= /= *= ++ --
*/
public class A015_Operadores {
    public static void main(String[] args) {
        System.out.println("OPERADORES ARITMÉTICOS");
        int number1,number2;
        double number3;

        number1 = 10;
        number2 = 20;
        number3 = 20;

        System.out.printf("Soma: %d + %d = %d.\n", number1, number2, (number1 + number2));
        System.out.printf("Subtração: %d - %d = %d.\n", number1, number2,  (number1 - number2));
        System.out.printf("Multiplicação: %d x %d = %d.\n", number1, number2,  (number1 * number2));
        System.out.printf("Divisão inteira: %d / %d = %d.\n", number1, number2,  (number1 / number2)); // Divisão entre dois números inteiros sempre retorna inteiro.
        System.out.printf("Divisão real: %d / %.0f = %.2f\n", number1, number3,  (number1 / number3)); // Para a divisão ser real, é necessário que um dos números seja float ou double.
        System.out.printf("Resto: %d %% %d = %d.\n", number1, 3,  (number1 % 3));
        System.out.println("-----------------------------------");

        System.out.println("OPERADORES RELACIONAIS");

        // Os operadores relacionais são utilizados para fazer comparações entre os valores, na maioria das vezes, utilizamos para testar se uma condição é verdadeira ou falsa.
        boolean is10MaiorQue20 = 10 > 20;
        boolean is10MenorQue20 = 10 < 20;
        boolean is10DiferenteDe20 = 10 != 20;
        boolean is10DiferenteDe10 = 10 != 10.0;

        System.out.println("10 > 20? " + is10MaiorQue20);
        System.out.println("10 < 20? " + is10MenorQue20);
        System.out.println("10 != 20? " + is10DiferenteDe20);
        System.out.println("10 != 10? " + is10DiferenteDe10);
        System.out.println("-----------------------------------");

        System.out.println("OPERADORES LÓGICOS");

        // São utilizados quando a complexidade da condição aumenta, permitindo testar várias condições e decidir entre uma ou outra.

        double valorPs5 = 5200;
        double valorCC = 5000;
        double valorCP = 3000;

        boolean haveCredit = valorCC >= valorPs5;
        boolean haveDebit = valorCP >= valorPs5;
        boolean haveFull = (valorCP + valorCC) >= valorPs5;
        boolean haveDebitOrCredit = valorCC >= valorPs5 || valorCP >= valorPs5;

        System.out.println("Tenho dinheiro para PS5? " + haveDebit);
        System.out.println("Tenho crédito para PS5? " + haveCredit);
        System.out.println("Tenho crédito ou débito para comprar PS5? " + haveDebitOrCredit);
        System.out.println("Tenho crédito + débito para PS5? " + haveFull);
        System.out.println("-----------------------------------");

        System.out.println("OPERADOR TERNÁRIO");

        String ternaryCondition = haveDebitOrCredit ? "Tenho crédito ou débito para comprar o PS5." : "Não posso comprar o PS5";
        System.out.println("Posso comprar o PS5 com o ternário? " + ternaryCondition);
        System.out.println("-----------------------------------");
    }
}
