package com.paulo.devdojo.utilityClasses.c02_strings;

/* Quando o volume de trabalho é muito grande, Strings tendem a perder a performance.
   Por isso, existem duas outras classes que trabalham com quantidades maiores de texto e performance muito superior que as Strings.

   StringBuilder trabalha com Strings, mas é um objeto diferente, que armazena um texto.
   Ele abstrai o valor da String, permitindo trabalhar com textos sem criar novas Strings no pool de Strings.
   Isso garante melhor performance, pois o Java não gastará recursos criando e pesquisando Strings no pool.

   A classe StringBuffer possui as mesmas características que StringBuilder. Sua principal diferença é que foi desenvolvida
   para trabalhar em ambientes multi-threads, onde um recurso pode ser acessado simultâneamente por outras pessoas.

   Quando o volume de dados não é tão grande, StrigBuffer apresenta melhor performance para trabalhar.
   Mas à medida em que a quantidade de texto aumenta, a melhor performance está na Stringbuilder. */
public class A110_PerformanceAndStringBuilderAndBuffer {
    public static void main(String[] args) {
        int length = 80000;

        testingStringPerformance(length);
        testingStringBuilderPerformance(length);
        testingStringBufferPerformance(length);
        System.out.println("---------------------------");

        /* É importante entender as diferenças quando usamos os métodos dessas classes.
           O método substring por exemplo, quando utilizado em uma String, retorna uma nova String contendo uma parte da String superior.
           Já quando é utilizado em um StringBuilder, retorna um StringBuilder, contendo o conteúdo daquele índice. Ou seja, para
           recuperar uma parte de uma String, contida em um StringBuilder, é necessário recuperar primeiro a String e trabalhar nela. */

        String name = "Paulo de Tarso Alves Nogueira";
        String firstName = name.substring(0, name.indexOf(" "));
        System.out.println(firstName);

        StringBuilder nameStringBuilder = new StringBuilder("Paulo de Tarso Alves Nogueira");
        String firstNameStringBuilder = nameStringBuilder.substring(0, name.indexOf(" "));
        System.out.println(firstNameStringBuilder);
    }

    public static void testingStringPerformance(int length) {
        long started = System.currentTimeMillis();
        String text = "";
        for(int i = 0; i <= length; i++) {
            text += i;
        }
        long finished = System.currentTimeMillis();
        System.out.println("String performance duration: " + (finished - started) + "ms.");
    }

    public static void testingStringBuilderPerformance(int length) {
        long started = System.currentTimeMillis();
        StringBuilder text = new StringBuilder(length);
        for(long i = 0; i <= length; i++) {
            text.append(i);
        }
        long finished = System.currentTimeMillis();
        System.out.println("StringBuilder performance duration: " + (finished - started) + "ms.");
    }

    public static void testingStringBufferPerformance(int length) {
        long started = System.currentTimeMillis();
        StringBuffer text = new StringBuffer(length);
        for(int i = 0; i <= length; i++) {
            text.append(i);
        }
        long finished = System.currentTimeMillis();
        System.out.println("StringBuffer performance duration: " + (finished - started) + "ms.");
    }
}
