package com.paulo.devdojo.m04_utilityClasses.c03_dates;

import com.paulo.devdojo.m04_utilityClasses.c03_dates.domain.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* SimpleDateFormat fornece maior flexibilidade em relação às classes anteriores, fornecendo uma série de letras, permitindo
   definir um leiaute de impressão de data. */
public class A118_SimpleDateFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(DateUtil.getDateDefault(calendar, "dd/MM/yyyy"));
        System.out.println(DateUtil.getDateDefault(calendar, "'Belo Horizonte', dd 'de' MMMM 'de' YYYY 'às' HH:mm:ss"));

        SimpleDateFormat sdf = new SimpleDateFormat("'Belo Horizonte', dd 'de' MMMM 'de' YYYY 'às' HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));

        /* Assim como na formatação de moedas, para criar uma data de acordo com um pattern específico, é obrigatório
           passar uma String exatamente como foi definido para máscara para o SimpleDateFormat.
           O parse retorna um Date, que poderá ser utilizado no futuro, através do método getTime(). */
        try {
            System.out.println("Getting date with SimpleDateFormat pattern.");
            calendar.setTime(sdf.parse("Belo Horizonte, 25 de fevereiro de 2023 às 15:34:05"));
            System.out.println(DateUtil.getDateDefault(calendar, "'Belo Horizonte', dd 'de' MMMM 'de' YYYY 'às' HH:mm:ss"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
