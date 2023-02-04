package com.paulo.devdojo.utilityClasses.c02_strings;

/* Strings fornecem uma quantidade de métodos úteis, que podem ser utilizados para manipulação do valor da String. */
public class A109_UtilityMethods {
    public static void main(String[] args) {
        String fullName = "Paulo Nogueira";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1); // Última posição excluída.

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);
        System.out.println("---------------------------------------------");

        for(int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println("\n---------------------------------------------");

        String job = "I will be a new fullstack developer.";
        job = job.replace("fullstack", "java");
        System.out.println(job);

        String jobFull = "I will be a new big bixo in fullStack developer";
        jobFull = jobFull
                .replace("will be", "am")
                .replace("fullstack", "java")
                .replace("new", "very")
                .replace("bixo", "bicho");
        System.out.println(jobFull);
        System.out.println("--------------------------------------------");

        System.out.println(job.toLowerCase());
        System.out.println(jobFull.toUpperCase());
        System.out.println("--------------------------------------------");

        String jobFulldido = "     I will be a new big bixo in fullStack developer    ";
        System.out.println(jobFulldido.trim());
    }
}
