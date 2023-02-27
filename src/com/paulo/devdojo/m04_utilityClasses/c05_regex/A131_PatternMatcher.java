package com.paulo.devdojo.m04_utilityClasses.c05_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Expressões regulares são utilizadas quando precisamos fazer uma pesquisa baseada em um conjunto de caracteres específicos.
   Esse conjunto de caracteres pode ser um texto padrão a ser buscado ou metacaracteres. Neste caso, quando executamos
   uma pesquisa passando como argumento um texto comum, o Matcher pesquisará exatamente pelo conteúdo da String.

   Basicamente funciona da seguinte forma:
   1 - Logicamente, precisamos de um conjunto de caracteres e um texto, onde esses carcteres serão pesquisados.
   2 - Um objeto Pattern irá compilar e validar a expressão que será buscada.
   3 - Um objeto Matcher vai recuperar no texto, o número dos índices onde inicia cada palavra encontrada. */
public class A131_PatternMatcher {
    public static void main(String[] args) {
        String positions = "012345678901234567890123";
        String expected =  "abraca";
        String text =      "abracadabracomendoabraca";

        Pattern pattern = Pattern.compile(expected);
        Matcher matcher = pattern.matcher(text);

        /* Podemos perceber que a palavra "abraca" só vai até o índice 5 do texto. Porém, o matcher conta até a posição
           6, que é a letra d. Ou seja, ele considera n+1 e exclui o último index. */
        while (matcher.find()) {
            System.out.printf("%d-%d: %s%n",matcher.start(), matcher.end(), text.substring(matcher.start(), matcher.end()));
        }
        System.out.println("----------------------------------");

        positions = "01234567890";
        expected =  "aba";
        text =      "ababacaba";

        pattern = Pattern.compile(expected);
        matcher = pattern.matcher(text);

        /* Neste segundo exemplo é importante perceber que no texto possui 3 palavras "aba", porém, apenas duas são
           consideradas. Por quê? Isso ocorre pois a segunda palavra inicia-se na posição 2 da String, mas essa posição
           ainda faz parte da palavra "aba" encontrada anteriormente. Neste caso, ela não é considerada uma nova palavra. */
        while (matcher.find()) {
            System.out.printf("%d-%d: %s%n",matcher.start(), matcher.end(), text.substring(matcher.start(), matcher.end()));
        }
        System.out.println("----------------------------------");
    }
}
