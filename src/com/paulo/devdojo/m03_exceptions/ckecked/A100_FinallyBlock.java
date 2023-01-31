package com.paulo.devdojo.m03_exceptions.ckecked;

import java.io.File;
import java.io.IOException;

public class A100_FinallyBlock {
    public static void main(String[] args) {
        File file = null;
        try {
            file = createFileWithTreatmentAndFinallyBlock("/home/psulo/Documents/cursos/java/devdojo/maratona-java-2023/src/com/paulo/devdojo/files/exception2.txt");
        } catch (IOException e) {
             System.out.println("Internal treatment: " + getExceptionName(e) + ": " + e.getMessage());
        }
        System.out.println(file);
    }

    // Independente do que aconteça no código, o bloco finally sempre será executado antes do return.
    public static File createFileWithTreatmentAndFinallyBlock(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()) {
            try {
                if(file.createNewFile()) {
                    return file;
                }
            } catch(IOException e) {
                System.out.println("Internal treatment: " + getExceptionName(e) + ": " + e.getMessage());
                throw e;
            } finally {
                System.out.println("Closing file.");
            }
        }
        return null;
    }
    public static String getExceptionName(Exception e) {
        return e.getClass().getSimpleName();
    }
}
