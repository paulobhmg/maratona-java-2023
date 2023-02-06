package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.time.Instant;
import java.time.LocalDateTime;

/* A classe Instant, assim como Date, trabalha com data a partir de 01/01/1970.
   Trabalha com a representação ZuloTime, ou zeja, a hora poderá ser diferente, de acordo com a zona
   Essa classe é utilizada em sistemas multinacionais ou nacionais, onde o fuso horário afeta o horário exato
   do acontecimento.

   Nesse caso, deverá ser feito um cálculo, transformando a data/hora em seu valor correto de acordo com a localização. */
public class A122_Instant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant);
        System.out.println(localDateTime);
    }
}
