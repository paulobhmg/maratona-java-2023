package com.paulo.devdojo.m03_exceptions.ckecked;

import java.io.File;
import java.io.IOException;

/* Exceções do tipo checked são aquelas que não o desenvolvedor não tem controle. É obrigado o tratamento deste
   tipo de exeção, pois quando ocorrem, param a execução do sistema se não forem tratadas. */
public class A097_Exception {
    public static void main(String[] args) {
        File file = createNewFile("/home/paulo/Documents/cursos/java/devdojo/maratona-java-2023/src/com/paulo/devdojo/files/exception.txt");
        System.out.println(file.getAbsolutePath());
    }

    public static File createNewFile(String path) {
        File file = new File(path);
        if(!file.exists()) {
            try{
                if(file.createNewFile()){
                    System.out.println("File created.");
                    return file;
                }
            }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return file;
    }
}
