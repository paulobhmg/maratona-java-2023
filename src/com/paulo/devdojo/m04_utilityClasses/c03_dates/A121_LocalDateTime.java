package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/* A classe LocalDateTime é a junção das duas outras. Ela trabalha com data e hora.
   Além disso, é possível criar uma instância de LocalDateTime a partir de um LocalDate ou LocalTime já instanciados. */
public class A121_LocalDateTime {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, Month.AUGUST, 17);
        LocalTime time = LocalTime.now();

        LocalDateTime dateFromTime = time.atDate(birthday);
        LocalDateTime timeFromDate = birthday.atTime(time);

        System.out.println("Birthday: " + birthday);
        System.out.println("Date from time: " + dateFromTime);
        System.out.println("time from date: " + timeFromDate);

        // Também pemite utilizar a interface TemporalField
        System.out.println(dateFromTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dateFromTime.get(ChronoField.MINUTE_OF_HOUR));
    }
}
