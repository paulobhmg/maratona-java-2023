package com.paulo.devdojo.m01_basico;

import java.util.Scanner;

/* Estruturas condicionais são utilizadas quando há a necessidade de tomada de decisão de acordo com alguma condição específica.
   Utilizamos as estruturas condicionais em conjunto com os operadores relacionais e lógicos, testando as possíveis condições e
   decidindo qual ação será tomada pelo programa.

   As principais estruturas de condição são: IF, IF ELSE, IF ELSE IF, SWITCH.
 */
public class A21_EstruturasCondicionais {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ESTRUTURA CONDICIONAL IF");
        System.out.print("Age: ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("Hi, you can entry to the party.");
        } else if (age < 18) {
            System.out.print("Money: ");
            double amountMoney = in.nextDouble();
            if (amountMoney >= 500) {
                System.out.println("Hi, you are young, but you have money, so you can entry to party.");
            } else {
                System.out.println("You don't have money or age to entry to the party.");
            }
        }
        System.out.println();
        System.out.print("Your salary: ");
        double salary = in.nextDouble();
        double rate = 0;

        if (salary <= 1700) {
            rate = 0.8;
        } else if (salary > 1700 && salary <= 4700) {
            rate = 0.9;
        } else {
            rate = 0.11;
        }
        System.out.printf("For %.2f amount the rate is %.2f.\n", salary, salary * rate);
        System.out.println("--------------------------------------------");

        System.out.println("ESTRUTURA CONDICIONAL SWITCH");

        System.out.print("What is your gender? F or M: ");
        char gender = in.next().charAt(0);
        String genderDescription = "";

        switch (gender) {
            case 'M':
                genderDescription = "Men";
                break;
            case 'F':
                genderDescription = "Woman";
                break;
            default:
                genderDescription = "Invalid";
        }
        System.out.println("Gender provided: " + genderDescription);
        System.out.println();

        System.out.print("Enter with a day of week (1 to 7): ");
        int dayOfWeek = in.nextInt();
        String dayOfWeekDescription = "";

        switch (dayOfWeek) {
            case 1:
                dayOfWeekDescription = "Sunday";
                break;
            case 2:
                dayOfWeekDescription = "Monday";
                break;
            case 3:
                dayOfWeekDescription = "Tuesday";
                break;
            case 4:
                dayOfWeekDescription = "Wednesday";
                break;
            case 5:
                dayOfWeekDescription = "Thursday";
                break;
            case 6:
                dayOfWeekDescription = "Friday";
                break;
            case 7:
                dayOfWeekDescription = "Saturday";
                break;
            default:
                dayOfWeekDescription = "Invalid.";
        }
        System.out.println("Day of week provided: " + dayOfWeekDescription);
        System.out.println();

        System.out.print("Enter with day of week (1 to 7): ");
        dayOfWeek = in.nextInt();

        switch(dayOfWeek) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dayOfWeekDescription = "Job day";
                break;
            case 1:
            case 7:
                dayOfWeekDescription = "Vacancy day";
                break;
            default:
                dayOfWeekDescription = "invalid day.";
        }
        System.out.println("Today is " + dayOfWeekDescription);
    }
}
