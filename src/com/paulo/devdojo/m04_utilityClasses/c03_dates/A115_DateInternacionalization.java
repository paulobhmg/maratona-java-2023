package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import com.paulo.devdojo.m04_utilityClasses.c03_dates.domain.DateUtil;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* A classe Locale é utilizada para parmitir que os programas sejam internacionalizaods.
   Ela segue duas ISOS, uma para a língua e outra para o País, que são passados como argumentos em seu construtor.
   Através dela é possível customizar a formatação de datas e moedas utilizadas em diversos países. */
public class A115_DateInternacionalization {
    public static void main(String[] args) {
        Locale italyLocale = new Locale("it", "IT");
        Locale chineLocale = new Locale("it", "CH");
        Locale indiaLocale = new Locale("hi", "IN");
        Locale japanLocale = new Locale("ja", "JP");
        Locale holandeLocale = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        System.out.println(DateUtil.getCalendarDateWithLocale(calendar.getTime(), DateFormat.FULL, italyLocale));
        System.out.println(DateUtil.getCalendarDateWithLocale(calendar.getTime(), DateFormat.FULL, indiaLocale));
        System.out.println(DateUtil.getCalendarDateWithLocale(calendar.getTime(), DateFormat.SHORT, chineLocale));
        System.out.println(DateUtil.getCalendarDateWithLocale(calendar.getTime(), DateFormat.LONG, japanLocale));
        System.out.println(DateUtil.getCalendarDateWithLocale(calendar.getTime(), DateFormat.MEDIUM, holandeLocale));
        System.out.println("------------------------------------");

        // Além de recuperar uma data formatada para um Locale específico, podemos recuperar o nome do País ou língua, de acordo com o Locale.
        System.out.println(italyLocale.getDisplayName() + " - " + italyLocale.getDisplayCountry());
        System.out.println(italyLocale.getDisplayName(japanLocale) + " - " + italyLocale.getDisplayCountry(japanLocale));
        System.out.println(italyLocale.getDisplayName(holandeLocale) + " - " + italyLocale.getDisplayCountry(holandeLocale));
        System.out.println(italyLocale.getDisplayName(indiaLocale) + " - " + italyLocale.getDisplayCountry(indiaLocale));
    }
}
