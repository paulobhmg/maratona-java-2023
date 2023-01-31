package com.paulo.devdojo.m03_exceptions;

import com.paulo.devdojo.m03_exceptions.domain.Reader1;
import com.paulo.devdojo.m03_exceptions.domain.Reader2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLNonTransientException;

/* Regras para sobrescrtia de Exceptions
   Se o método de uma classe lança exceção, as classes filhas não são obrigadas a lançar as exceções declaradas na assinatura do método na classe pai.
   Isso acontece pois o método será sobrescrito na classe filha e ela poderá escolher entre lançar todas, uma ou nenhuma exceção da classe pai.

   Nas classes filhas NÃO É PERMITIDO:
    - Lançar exeções do tipo checked que não foram definidas na classe pai.
    - Lançar exeções mais genéricas do que as definidas na classe pai

   É PERMITIDO:
    - Lançar exceções do tipo RuntimeException, mesmo que não estejam definidas na classe pai.
      Como essas exceções não tem tratamento obrigatório, não tem problema.
    - Lançar exceções mais espefícas do que a definida na classe pai.
*/
public class A105_OverrideExceptionRoles {
    public static void main(String[] args) {
        Reader1 reader1 = new Reader1();
        Reader2 reader2 = new Reader2();

        try {
            reader1.close();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName());
        }

        reader2.close();
        System.out.println("--------------------------------------");

        try {
            reader1.genericException();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

        // No multicatch, as classes não podem fazer parte da mesma linha de herança. Quando for esse o caso, utilizar mais genérica
        try {
            reader2.genericException();
        } catch (FileNotFoundException | SQLNonTransientException e) {
            throw new RuntimeException(e);
        }
    }
}
