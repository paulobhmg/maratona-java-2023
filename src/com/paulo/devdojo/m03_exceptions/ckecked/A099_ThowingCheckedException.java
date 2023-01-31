package com.paulo.devdojo.m03_exceptions.ckecked;

import java.io.File;
import java.io.IOException;

/* Existem vantagens em lançar exceções e não tratá-las dentro do método em que elas foram criadas.
   Isso permite que a exceção seja tratada por quem está chamando o método, customizando o tratamento de acordo com o contexto em que a exceção
   foi lançada.
   Além disso, é possível capturar a exceção e ainda lançar para que possa ser tratada
 */
public class A099_ThowingCheckedException {
    public static void main(String[] args) {
        File file = null;
        try {
            file = createFileWithTreatment("/home/pasulo/Documents/cursos/java/devdojo/maratona-java-2023/src/com/paulo/devdojo/files/exception2.txt");
        } catch (IOException e) {
            System.out.println("External treatment: " + getExceptionName(e) + ": " + e.getMessage());;
        }
        System.out.println(file);
    }

    // Neste exemplo, o código captura uma exceção, exibe a mensagem e lança ela para o método main tratar.
    // Quando é feito um novo tratamento, A mensagem é exibida novamente.
    public static File createFileWithTreatment(String path) throws IOException{
        File file = new File(path);
        if(!file.exists()) {
            try {
                if(file.createNewFile()) {
                    return file;
                }
            } catch(IOException e) {
                System.out.println("Internal treatment: " + getExceptionName(e) + ": " + e.getMessage());
                throw e;
            }
        }
        return file;
    }

    public static String getExceptionName(Exception e) {
        return e.getClass().getSimpleName();
    }
}
