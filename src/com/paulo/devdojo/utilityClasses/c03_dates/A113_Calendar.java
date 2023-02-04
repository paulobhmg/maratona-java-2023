package com.paulo.devdojo.utilityClasses.c03_dates;

import com.paulo.devdojo.utilityClasses.c03_dates.domain.DateUtil;

import java.util.Calendar;
import java.util.Date;

/* A classe Calendar foi criada para solucionar algumas das limitações da classe Date.
   Ela é uma classe abstrata e não pode ser instanciada. Para obter um objeto do tipo Calendar é necessário utilizar métodos
   estáticos da classe, que retornarão um objeto.  */
public class A113_Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // O método toString do calendar não é amigável.
        System.out.println(calendar);

        // É possível criar um Date através do calendar e imprimir a data ou formatar a data a partir de classes específicas.
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println("--------------------------------");

        // Métodos úteis da classe Calendar
        System.out.println("Weeks in year: " + calendar.getWeeksInWeekYear());
        System.out.println("First day of week: " + calendar.getFirstDayOfWeek());
        System.out.println("--------------------------------");

        System.out.println(DateUtil.getCalendarDate(calendar));
        System.out.println("--------------------------------");

        /* Também é possível manipular uma data, alterando qualquer um dos campos, com o método add.
           O método ADD altera o campo para o próximo, dependendo do valor que for passado. Supondo que a data atual seja 05/01 às 23:00.
           Caso eu adicione 4 horas com o método ADD, a data passará a ser 06/01 às 03:00.

           Caso queira que o campo manipulado permaneça sem alterar os demais, devemos utilizar o método ROLL. */
        calendar.add(Calendar.HOUR_OF_DAY, 5);
        System.out.println(DateUtil.getCalendarDate(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, 17);
        System.out.println(DateUtil.getCalendarDate(calendar));

        // Já utilizando o método ROLL, vamos ver que as horas resetarão, mas a data não será alterada.
        calendar.roll(Calendar.HOUR_OF_DAY, 28);
        System.out.println(DateUtil.getCalendarDate(calendar));
    }
}
