package com.paulo.devdojo.m03_exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLNonTransientException;

/* O multicatch permite tratar várias exceções na mesma linha.
   A regra é que as exceções não devem fazer parte da mesma linha de herença. */
public class A102_InlineMulticatchs {
    public static void main(String[] args) {
        try {
            throwMultiCatching();
        } catch (FileNotFoundException | SQLNonTransientException e) {
            System.out.println(getExceptionName(e));
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e /*| IndexOutOfBoundsException e */) {
            System.out.println(getExceptionName(e));
        }
    }
    public static void throwMultiCatching() throws FileNotFoundException, SQLNonTransientException {
        throw new IllegalArgumentException();
    }
    public static String getExceptionName(Exception e) {
        return e.getClass().getSimpleName();
    }
}