package com.paulo.devdojo.utilityClasses.c03_dates;

import java.util.Locale;

/* É possível extrair a lista de línguas e países disponíveis para utilização na classe Locale. */
public class A116_LocaleList {
    public static void main(String[] args) {
        String[] countries = Locale.getISOCountries();
        String[] languages = Locale.getISOLanguages();

        int cont = 1;
        System.out.println("Countries: ");
        for(String country: countries) {
            System.out.print(country);
            if(cont < 50) {
                System.out.print(", ");
                cont++;
            } else {
                cont = 1;
                System.out.println();
            }
        }
        System.out.println("\n--------------------------");

        cont = 1;
        System.out.println("Languages: ");
        for(String language: languages) {
            System.out.print(language);
            if(cont < 50) {
                System.out.print(", ");
                cont++;
            } else {
                cont = 1;
                System.out.println();
            }
        }
        System.out.println("\n-------------------------");
    }
}
