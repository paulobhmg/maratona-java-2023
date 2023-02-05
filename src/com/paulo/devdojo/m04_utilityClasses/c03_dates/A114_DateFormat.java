package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import java.text.DateFormat;
import java.util.Calendar;

/* DateFormat é uma classe abstrata que permite formatar datas de forma predefinida. */
public class A114_DateFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dfs = new DateFormat[7];

        dfs[0] = DateFormat.getInstance();
        dfs[1] = DateFormat.getDateInstance();
        dfs[2] = DateFormat.getDateTimeInstance();
        dfs[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfs[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfs[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfs[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dfs) {
            System.out.println(df.format(calendar.getTime()));
        }

    }
}
