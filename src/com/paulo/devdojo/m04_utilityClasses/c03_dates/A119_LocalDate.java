package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/* LocalDate permite utilizar um número significativamente grande em relação às classes vistas anteriormente.
   Trabalha apenas com datas, ou seja, deve ser utilizada em sistemas onde a hora é irrelevante.
   Seus métodos são simples. */
public class A119_LocalDate {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, Month.AUGUST, 17);
        System.out.println("Birthday: " + getBirthday(birthday));
        System.out.println("Is leap year? " + birthday.isLeapYear());
        System.out.println("----------------------------");

        /* Além dos métodos padrões, o método get() permite usar algumas interfaces, da família TemporalField, que retornam diversas informações
           referentes aos atributos de data. */
        System.out.println(birthday.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthday.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthday.get(ChronoField.YEAR));
        System.out.println("----------------------------");

        System.out.println(birthday.lengthOfMonth());
        System.out.println(birthday.lengthOfYear());
        System.out.println("----------------------------");

        /* A classe LocalDate é imutável e thread-safe.
           Uma classe imutável não altera o estado do objeto. Neste caso, sempre que é feita uma alteração, deverá criar uma
           nova variável de referência, que vai substituir o objeto anterior. */
        birthday.plusWeeks(5);
        System.out.println(birthday); // O valor da variável permenaceu o mesmo.

        birthday = birthday.plusWeeks(6); // Nesta linha é feita uma nova atribuição, com o valor atualizado.
        System.out.println(birthday);
    }

    /* Facilmente conseguimos obter informações da data e até mesmo montar um layout próprio */
    public static String getBirthday(LocalDate birthday) {
        return String.format("%d/%d/%d", birthday.getDayOfMonth(), birthday.getMonthValue(), birthday.getYear());
    }
}
