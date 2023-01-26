package com.paulo.devdojo.m01_basico;

/* Variáveis são utilizadas para armazenar as valores em memória, permitindo utilizar esses valores
   durante a execução do programa. As variáveis de tipo primitivo são aquelas que armazenam um único tipo de dado e são:
   byte, short, int, long, float, double, boolean e char.

   Cada tipo primitivo ocupa um espaço específico na memória e possui um tamanho máximo em bits, ou seja,
   cada tipo poderá armazenar um valor até um limite específico.
 */
public class A010_TiposPrimitivos {
    public static void main(String[] args) {
        byte  age = 127;
        short money = 32422;
        int   moreMoney = 280029929;
        long  bigMoney = 10_000_000_000_000L;
        float decimalMoney = 1.23F;
        double moreDecimalMoney = 25000.0;
        boolean testValue = true;
        char oneCaracter = 'P';

        System.out.println(age);
        System.out.println(money);
        System.out.println(moreMoney);
        System.out.println(bigMoney);
        System.out.println(decimalMoney);
        System.out.println(moreDecimalMoney);
        System.out.println(testValue);
        System.out.println(oneCaracter);

        /* Como cada tipo de dado possui um tamanho em bits, uma variável do tipo short, por exemplo, não consegue armazenar
           um valor muito grande, como por o valor de um int ou long. Para isso, é necessário informar explicitamente que
           queremos fazer um casting. Dessa forma, haverá a quebra de bit, ou seja, o java vai calcular até quantos bits
           é possível armazenar naquele tipo de dado e armazenar ali o valor máximo permitido, eliminando o restante.

         Também existe o casting implícito. Por exemplo, quando tentamos armazenar o valor de um short em um int, o cast é
         feito implicitamente pelo Java, pois um short cabe perfeitamente em um int. O contrário não é verdadeiro. */

        short shortNumber = 3000;
        int intNumber = 300000;

        shortNumber = (short) intNumber; // Cast explícito
        intNumber = shortNumber; // Cast implícito
    }
}
