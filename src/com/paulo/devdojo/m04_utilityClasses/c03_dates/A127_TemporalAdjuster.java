package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.*;

/* A interface TemporalAdjuster permite fazer ajustes no tempo, assim como a classe TemporalAdjuster, porém dá mais possibilidades
   para tratar situações que não são tratadas nativamente pela classe.
   Uma dessas situações é a verificação de dias úteis, como no exemplo abaixo, que verifica se uma data é fim de semana e caso seja,
   retorna o próximo dia útil, neste caso, segunda feira.

   Esse exemplo poderia ainda ser melhorado, caso houvessem feriados cadastrados. */
class Adjuster implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        return switch (dayOfWeek) {
            case FRIDAY, SATURDAY, SUNDAY -> temporal.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            default -> temporal.plus(1, ChronoUnit.DAYS);
        };
    }
}
public class A127_TemporalAdjuster {
    public static void main(String[] args) {
        LocalDate friday = LocalDate.of(2023, Month.FEBRUARY, 10);
        System.out.println(friday);

        System.out.println(friday.with(new Adjuster()));
    }
}
