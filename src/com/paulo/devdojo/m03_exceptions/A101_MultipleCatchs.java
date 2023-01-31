package com.paulo.devdojo.m03_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.sql.SQLNonTransientException;

/* É possível capturar múltiplas exceções em um mesmo bloco try, desde que seja respeitada algumas regras, dentre elas,
   a ordem hierárquica entre classes que pertencem à mesma linha de herança.
   Uma classe mais genérica não deve ser listada antes das demais pois caso o sistema capture uma exceção genérica,
   as mais específicas serão ignoradas.
 */
public class A101_MultipleCatchs {
    public static void main(String[] args) {
        // Neste caso estamos capturando multiplas exceções que fazem parte da mesma linha de herança, RuntimeException
        throwingException();


        /* Neste caso estamos jogando a responsabilidade para o método main, que deverá tratar as possíveis exceções lançadas pelo método.
           No bloco tryCatch, é possível trabalhar com exeções mais genéricas do que aquelas definidas na assinatura do método.
           É importante observar que neste método as exceções não fazem parte da mesma linha de herança, mas caso houvessem
           outras exceções na mesma linha, deveriam respeitar a hieraquia. */
        try {
            maybeThrowsException();
        } catch (IOException e) {
            System.out.println(getExceptionName(e));
        } catch (Exception e) {
            System.out.println(getExceptionName(e));
        }
    }

    public static void throwingException() {
        try {
            throw new IndexOutOfBoundsException();
        } catch(IllegalArgumentException e) {
            System.out.println(getExceptionName(e));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(getExceptionName(e));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(getExceptionName(e));
        } catch(ArithmeticException e) {
            System.out.println(getExceptionName(e));
        } catch(RuntimeException e) {
            System.out.println(getExceptionName(e));
        }
    }

    public static void maybeThrowsException() throws FileNotFoundException, SQLNonTransientException {
        throw new SQLNonTransientException();
    }
    public static String getExceptionName(Exception e) {
        return e.getClass().getSimpleName();
    }
}
