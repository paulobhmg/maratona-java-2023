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
        System.out.println(Duration.ofDays(10));
        System.out.println(Duration.ofHours(50));
        System.out.println(Duration.ofMinutes(600));
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
        System.out.println("---------------------------------");

        begin = LocalDateTime.of(2023, Month.FEBRUARY, 14, 20, 25, 2);
        end =   begin.plusHours(5).plusMinutes(13).plusSeconds(28);

        Duration duration = Duration.between(begin, end);
        LocalTime timeCalculated = DateUtil.getTimeCalculated(duration);
        System.out.println(timeCalculated);

        // Além do método estático da classe, é possível trabalhar utilizando o próprio objeto, desde que seja um Temporal.
        System.out.println(birthday.until(LocalDateTime.now(), ChronoUnit.YEARS));
        System.out.println(birthday.until(LocalDateTime.now(), ChronoUnit.MONTHS));
        System.out.println(birthday.until(LocalDateTime.now(), ChronoUnit.DAYS));
    }
}
