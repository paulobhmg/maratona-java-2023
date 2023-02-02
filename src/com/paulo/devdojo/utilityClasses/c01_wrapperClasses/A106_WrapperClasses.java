package com.paulo.devdojo.utilityClasses.c01_wrapperClasses;

/* As classes wrapper incapsulam os tipos primitivos, transformando-os em objetos. Dessa forma, é possível utizar métodos
   que facilitam o trabalho com essas classes e utilizar referências, utilizado como passagem de parâmetro por referência.
   Eles possuem a mesma capacidade de um tipo primitivo.
   Clases Wrappers fornecem métodos úteis que facilitam o trabalo com os números.

   Wrappers utilizam o conceito de autoboxing e unboxing.
   Autoboxing é quando converte um tipo primitivo em um objeto
   Unboxing é quando converte um Wrapper em um tipo primitivo. */
public class A106_WrapperClasses {
    public static void main(String[] args) {

        // Processo autoboxing
        Byte byteW = 127;
        Short shortW = 32000;
        Integer intW = 100000;
        Long longW = 1000L;
        Float floatW = 10.5F;
        Double doubleW = 10.5;
        Character characterW = 'P';
        Character characterDigitW = '3';
        Boolean booleanW = false;

        // Processo unboxing
        int i = intW;

        // Métodos úteis classes wrapper
        int intParse = Integer.parseInt("10");
        System.out.println(intParse);

        int intFromDouble = doubleW.intValue();
        System.out.println(intFromDouble);

        // Métodos úteis para Character
        System.out.println(Character.isAlphabetic(characterW));
        System.out.println(Character.isDigit(characterDigitW));
        System.out.println(Character.isLetter(characterW));
        System.out.println(Character.isLetter(characterDigitW));

        System.out.println(Character.toLowerCase(characterW));
        System.out.println(Character.toUpperCase(characterW));
    }
}
