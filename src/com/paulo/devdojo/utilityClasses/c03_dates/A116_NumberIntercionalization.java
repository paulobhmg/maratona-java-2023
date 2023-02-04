package com.paulo.devdojo.utilityClasses.c03_dates;

import java.text.NumberFormat;
import java.util.Locale;

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

        double number = 10_000_000.2312;

        for(NumberFormat nf : nfs) {
            System.out.println(nf.format(number));
        }
    }
}
