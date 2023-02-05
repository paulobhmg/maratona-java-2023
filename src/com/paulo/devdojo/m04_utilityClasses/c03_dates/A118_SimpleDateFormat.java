package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import com.paulo.devdojo.m04_utilityClasses.c03_dates.domain.DateUtil;

import java.util.Calendar;

/* SimpleDateFormat fornece maior flexibilidade em relação às classes anteriores, fornecendo uma série de letras, permitindo
   definir um leiaute de impressão de data. */
public class A118_SimpleDateFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(DateUtil.getDateDefault(calendar, "dd/MM/yyyy"));
        System.out.println(DateUtil.getDateDefault(calendar, "'Belo Horizonte', dd 'de' MMMM 'de' YYYY 'às' HH:mm:ss"));
    }
}
