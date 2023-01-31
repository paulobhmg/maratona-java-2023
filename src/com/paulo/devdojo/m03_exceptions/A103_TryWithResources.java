package com.paulo.devdojo.m03_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* Trabalhar com tryWithResources garante melhor legibilidade para o código e ainda minimiza a chance de erros ao esquecer
   algum recurso do sistema operacional aberto, consumindo memória e processamento.

   Ver detalhes em cada método específico criado abaixo para exemplo. */
public class A103_TryWithResources {
    public static void main(String[] args) {
        trySimpleTryCatch("/home/paulo/Documents/cursos/java/devdojo/maratona-java-2023/src/com/paulo/devdojo/files/exception2.txt");
        tryWithResources("/home/pulo/Documents/cursos/java/devdojo/maratona-java-2023/src/com/paulo/devdojo/files/exception2.txt");
    }

    /* Neste método, o arquivo Reader é criado diretamente na chamada do bloco try, que instancia o objeto e se encarrega
       do seu fechamento ao fim da execução. Sendo assim, o bloco finally só será necessário caso alguma tarefa deva ser
       executada ao final do método.

       Além disso, torna-se opcional o uso do catch, mas quando utiliza-se dessa forma, eé obrigatório o lançamento da exceção
       para ser tratada no método externo. */
    public static void tryWithResources(String path) {
        try(Reader reader = new BufferedReader(new FileReader(path))) {

        } catch (IOException e) {
            System.out.println(getExceptionName(e));
        } finally {
            System.out.println("Closing read..");
        }
    }

    /* Neste método é nítida a diferença sem utilizar o tryWithResources.
       O objeto deve ser criado antes e trabalhado dentro do tryCatch, mas como há a possibilidade de abertura de recurso
       do sistema operacional e ter sido capturada uma exceção que impeça o processamento, é necessário utilizar um novo
       tryCatch, só para tentar fechar o arquivo, que poderá gerar ainda uma outra exceção.

       Dependendo da quantidade de tryCatchs dentro do mesmo bloco, pode começar a ficar confuso. */
    public static void trySimpleTryCatch(String path) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch(IOException e) {
            System.out.println(getExceptionName(e));
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                    System.out.println("Reader closed.");
                }
            } catch(IOException e) {
                System.out.println(getExceptionName(e));
            }
        }
    }
    public static String getExceptionName(Exception e) {
        return e.getClass().getSimpleName();
    }
}
