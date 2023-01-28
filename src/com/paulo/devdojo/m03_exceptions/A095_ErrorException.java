package com.paulo.devdojo.m03_exceptions;

/* Existem situações que podem ocorrer durante a execução do sistema que podem não estar ao alcance do desenvolvedor.
   Por isso, as exceptions são utilizadas para capturar as exceções e tratá-las, evitando a parada do sistema.

   Exeções do tipo Error interrompem a execução do sistema. Quando essa exceção acontece, não há nada a ser feito e o
   sistema deve ser reiniciado.  */
public class A095_ErrorException {
    public static void main(String[] args) {
        recurse();
    }

    public static void recurse() {
        recurse();
    }
}
