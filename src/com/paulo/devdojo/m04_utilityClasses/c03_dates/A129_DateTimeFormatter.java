package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* A classe DateTimeFormatter permite formatar de forma simples as datas, de acordo com algumas constantes
   predefiniddas, baseadas em ISOS. */
public class A129_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String f1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String f2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String f3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        // Para fazer o parse é preciso definir qual é o formato. O valor passado como argumento deve seguir esse formato.
        LocalDate parse1 = LocalDate.parse("20230208", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-02-08-03:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-02-08", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse4 = LocalDate.parse("2023-02-08-03:00", DateTimeFormatter.ISO_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println(parse4);

        // Esse parse não funciona, pois o valor está sendo passado fora do padrão BASIC_ISO_DATE.
        // LocalDate parse5 = LocalDate.parse("2023-02-08", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("--------------------------------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Para o localDateTime, a formatação não obriga informar o DateTimeFormatter, pois já é igual à sua representação pelo toString().
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2023-02-08T22:14:33.317911051");
        LocalDateTime localDateTimeParse2 = LocalDateTime.parse("2023-02-08T22:14:33.317911051", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(localDateTimeParse);
        System.out.println(localDateTimeParse2);
        System.out.println("--------------------------------------");
        
        // É possível também criar o próprio leiaute, com o ofPattern
        DateTimeFormatter dateTimePatternFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dateTimePatternFormatterWithLocale = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss", Locale.US);
        System.out.println(localDateTime.format(dateTimePatternFormatter));
        System.out.println(localDateTime.format(dateTimePatternFormatterWithLocale));
    }
}
