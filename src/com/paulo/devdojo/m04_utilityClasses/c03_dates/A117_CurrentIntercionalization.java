package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* Ainda utilizando a classe DateFormat, temos uma instância específica que faz a conversão da moeda local, enquanto
   o modelo anterior faz a formatação apenas do número. */
public class A117_CurrentIntercionalization {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Locale japanLocale = new Locale("ja", "JP");
        Locale indiaLocale = new Locale("hi", "IN");

        NumberFormat[] nfs = new NumberFormat[6];
        nfs[0] = NumberFormat.getCurrencyInstance();
        nfs[1] = NumberFormat.getCurrencyInstance(usLocale);
        nfs[2] = NumberFormat.getCurrencyInstance(japanLocale);
        nfs[3] = NumberFormat.getCurrencyInstance(indiaLocale);
        nfs[4] = NumberFormat.getCurrencyInstance(new Locale("it", "IT"));
        nfs[5] = NumberFormat.getCurrencyInstance(new Locale("ch", "IT"));

        double doubleNumber = 1_000.2312;
        String stringNumber = "1000.2312";

        for(NumberFormat nf : nfs) {
            System.out.println(nf.format(doubleNumber));
        }

        /* Diferente da instância para números, o metodo parse() aqui não espera apenas uma String.
           A String deverá ser exatamente no formato da moeda do país, caso contrário será lançada exception.  */
        try {
            System.out.println(nfs[1].parse(stringNumber));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Já neste caso a tranformação funciona normalmente, pois o número pode ser convertido.
        stringNumber = "$1,000.2312";
        try {
            System.out.println(nfs[1].parse(stringNumber));
            System.out.println("String converted.");
        } catch(ParseException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------");
    }
}
