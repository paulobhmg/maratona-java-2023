package com.paulo.devdojo.m04_utilityClasses.c02_strings;

/* Strings são utilizadas para armazenamento de textos.
   Elas são imutáveis e tem uma área reservada apenas para Strings, chamada "pool de strings".

   Quando temos duas variáveis String com o mesmo valor, o Java não cria dois espaços em memória. Ele utiliza a mesma referência
   para a String que já está criada no pool de Strings.

   Quando criamos uma String utilizando a sintaxe de criação de objetos,
 */
public class A108_Strings {
    public static void main(String[] args) {
        String name = "Paulo";
        String surname = "Nogueira";

        System.out.println(name + " " + surname);

        String paulo = "Paulo";

        /* É impossível alterar uma String. É necessário criar uma nova variável de referência. No caso abaixo, temos três variáveis:
           Nome, sobrenome e fullName, que é a concatenação do nome e Sobrenome. */
        String fullName = name + " " + surname;
        System.out.println(fullName);

        /* Quando comparamos Srings devemos utilizar o equals(), pois ele é utilizado para comparações de objetos e garante melhor performance.
           Neste caso, o valor da String será utilizado na comparação. */
        System.out.println(name.equals(paulo));
        System.out.println(name == paulo);
        System.out.println(name == surname);
        System.out.println("---------------------------------------");

        /* Porém, quando criamos Strings com sintaxe de objetos, a referência passa a ser do Objeto String e não do valor em si.
           Neste caso, devemos comparar uma String lembrando do conceito de Intern. Ou seja, deve-se comparar o valor contido na
           String, e não o seu espaço em memória.

           Um outro detalhe importante é que Será criado um objeto String no HEAP e uma String no POOL de Strings. */

        String objectString = new String("Paulo");
        String literalString = "Paulo";

        System.out.println(objectString == literalString);
        System.out.println(objectString.intern().equals(literalString));
    }
}
