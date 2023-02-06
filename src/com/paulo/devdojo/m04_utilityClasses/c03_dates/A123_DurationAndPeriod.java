package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import com.paulo.devdojo.m04_utilityClasses.c03_dates.domain.DateUtil;

import java.time.*;
import java.time.temporal.ChronoUnit;

/* A classe Duration é utilizada para calcular a diferença entre duas datas.
   As datas utilizadas para essa classe devem trabalhar com nanossegundos, como LocalDate e LocalDateTime.
   Ela calcula a diferença entre datas e retorna essa diferença em horas, permitindo trabalhar com horas, minutos, segundos e nanossegundos.

   A classe Period também calcula a diferença entre duas datas, permitindo trabalhar com anos, semanas, dias.
   Essa classe é utilizada quando a hora não é importante. */
public class A123_DurationAndPeriod {
    public static void main(String[] args) {
        LocalDateTime begin = LocalDateTime.now();
        LocalDateTime end = begin.plus(3, ChronoUnit.HOURS).plusMinutes(25);

        Duration time = Duration.between(begin, end);
        System.out.println(time);
        System.out.println("---------------------------------");

        LocalDate birthday = LocalDate.of(1992, Month.AUGUST, 17);
        Period period = Period.between(birthday, LocalDate.now());
        System.out.println(period);

        System.out.println(DateUtil.getPeriodFromLocalDate(period));
        System.out.println("---------------------------------");

        System.out.println(Period.ofDays(120));
        System.out.println(Period.ofMonths(30));
        System.out.println(Period.ofYears(3));
        System.out.println(Period.ofWeeks(30)); // Quando utilizamos o ofWeek(), internamente o Java faz uma conversão para dias, retornando o número de dias.
    }
}
