package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/* A classe LocalTime funciona basicamente como a LocalDate, com a difererença que aqui só se trabalha com horas */
public class A120_LocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 11, 35);
        LocalTime now = LocalTime.now();

        System.out.println(time);
        time.plusHours(10); // Essa classe também é imutável. Será necessário atribuir uma nova variável.
        System.out.println(time);

        time = time.plusHours(10);
        System.out.println(time);

        System.out.println(now);

        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

    }
}
