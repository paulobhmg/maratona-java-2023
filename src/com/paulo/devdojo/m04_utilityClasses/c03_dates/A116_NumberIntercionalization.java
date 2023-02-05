package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* A intercionalização de números é feita através da classe NumberFormat, que também trabalha com a classe Locale,
   permitindo trabalhar com o número no formato de um país específico.  */
public class A116_NumberIntercionalization {
    public static void main(String[] args) {
        Locale brazilLocale = new Locale("pt", "BR");
        Locale japanLocale = new Locale("ja", "JP");
        Locale indiaLocale = new Locale("hi", "IN");

        NumberFormat[] nfs = new NumberFormat[6];
        nfs[0] = NumberFormat.getNumberInstance();
        nfs[1] = NumberFormat.getNumberInstance(brazilLocale);
        nfs[2] = NumberFormat.getNumberInstance(japanLocale);
        nfs[3] = NumberFormat.getNumberInstance(indiaLocale);
        nfs[4] = NumberFormat.getNumberInstance(new Locale("it", "IT"));
        nfs[5] = NumberFormat.getNumberInstance(new Locale("ch", "IT"));

        double doubleNumber = 1_000.2312;
        String stringNumber = "1_000.2312";

        for(NumberFormat nf : nfs) {
            System.out.println(nf.format(doubleNumber));
        }
        System.out.println("---------------------------");

        /* É possível criar um número a partir de um valor em String, porém é preciso tomar cuidado, pois alguns caracteres
           podem fazer com que o parse do número seja interrompido. Por exemplo, 1_000 é aceito como representação do número, mas
           uma String com esse valor não é convertida para número, pois o _ representa um caractere.
           Neste caso, apenas o primeiro número será considado e tudo a partir do _ será ignorado. */
        try {
            System.out.println(nfs[0].parse(stringNumber));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Já neste caso a tranformação funciona normalmente, pois o número pode ser convertido.
        stringNumber = "1000.2312";
        try {
            System.out.println(nfs[1].parse(stringNumber));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------");

        // Também é possível definir o número máximo de casas decimais para uma formatação.
        nfs[3].setMaximumFractionDigits(2);
        System.out.println(nfs[3].format(doubleNumber));
    }
}
