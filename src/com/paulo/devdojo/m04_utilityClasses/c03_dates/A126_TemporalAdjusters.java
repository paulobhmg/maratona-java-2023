package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/* A classe TemporalAdjusters é uma classe Abstrata que fornece diversos métodos staticos para manipulação de datas
   da biblioteca Java.Time que permitem manipular facilmente as informações de Data. */
public class A126_TemporalAdjusters {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now.getDayOfWeek());
        System.out.println("Today normal: " + now);

        /* Quando utilizamos o método plus(), plusDays() ou qualquer outro, toda a data é alterada, adicionando a ela o novo período.
           Porém, quando não queremos que o comportamento seja assim, utilizamos o método with(). Esse método vai alterar os campos
           da data individualmente, sem alterar os demais campos. */
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println("now configure to be 20: " + now);

        now = now.with(ChronoField.MONTH_OF_YEAR, 8);
        System.out.println("now with month 8: " + now);
        System.out.println("---------------------------------------------");

        // Utilizando os métodos da classe TemporalAdjusters
        now = LocalDate.now();
        System.out.println(now.with(TemporalAdjusters.next(now.getDayOfWeek())));
        System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
