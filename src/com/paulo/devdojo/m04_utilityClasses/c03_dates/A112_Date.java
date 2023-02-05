package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.Instant;
import java.util.Date;

/* A classe Date foi a primeira introduzida pelo Java para trabalhar com Data.
   Devido à várias limitações ao se trabalhar com datas ela foi depreciada e não é utilizada em novos sistemas, existindo
   apenas para manter a retrocompatibilidade com sistemas legados.

   A date recebe em seu construtor um long, representando uma data em milissegundos.
   O único método utilizável nessa classe é o getTime(), que retorna um long, que pode ser utilizado para calcular datas.

   Também é possível usar o toInstant(), visando atualizar essa data para as classes mais atuais. */
public class A112_Date {
    public static void main(String[] args) {
        long millis = 100_000_000L;
        Date today = new Date();
        Date firstDate = new Date(millis);

        System.out.println(firstDate);
        System.out.println(today);

        System.out.println(firstDate.getTime());
        System.out.println(today.getTime());

        Instant instantNow = today.toInstant();
        System.out.println(instantNow);
    }
}
