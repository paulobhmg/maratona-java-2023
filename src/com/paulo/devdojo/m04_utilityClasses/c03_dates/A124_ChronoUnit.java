package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import com.paulo.devdojo.m04_utilityClasses.c03_dates.domain.DateUtil;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/* A classe ChronoField é a que define as constantes para se trabalhar com data e hora no pacote Java.time
   Referenciamos a própria constante para trazer o resultado esperado. */
public class A124_ChronoUnit {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1992, Month.AUGUST, 17, 05, 0, 43);
        System.out.println("Seconds: " +ChronoUnit.SECONDS.between(birthday, LocalDateTime.now()));
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(birthday, LocalDateTime.now()));
        System.out.println("Hours: " + ChronoUnit.HOURS.between(birthday, LocalDateTime.now()));
        System.out.println("Days: " + ChronoUnit.DAYS.between(birthday, LocalDateTime.now()));
        System.out.println("Weeks: " + ChronoUnit.WEEKS.between(birthday, LocalDateTime.now()));
        System.out.println("Months: " + ChronoUnit.MONTHS.between(birthday, LocalDateTime.now()));
        System.out.println("Years: " + ChronoUnit.YEARS.between(birthday, LocalDateTime.now()));
    }
}
