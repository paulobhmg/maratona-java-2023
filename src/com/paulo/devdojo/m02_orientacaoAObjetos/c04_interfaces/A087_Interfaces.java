package com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces;

import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.domain.DatabaseLoader;
import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.domain.FileLoader;
import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces.IDataRemover;

/* Interfaces são contratos que especificam quais funcionalidades uma classe deve possuir.
   Java não possui herança múltipla. Por isso, utilizamos interface, que permite definir vários contratos para uma ou mais classes.

   Os métodos de uma interface, por padrão, são publicos e abstratos e todos os métodos abstratos definidos em uma interface deverão
   obrigatoriamente ser implementados nas classes que utilizam esse contrato.

   Existem métodos default, introduzidos a partir da versão 8 do Java. Eles foram criados com o objetivo de solucionar a quebra do código,
   pois sempre que uma classe implementa uma interface, é obrigada a implementar seus métodos. Sendo assim, quebraria o código das classes
   que já fazem uso da interface. Por isso, os métodos default tem um corpo definido na interface e não é obrigatório sua implementação, mas
   é possível utilizá-lo, mesmo sem sobrescrevê-lo, pois ele está definido na interface.

   Todos os atributos de interfaces são, por padrão, static final. Sendo assim, serão membros apenas da interface.
   Interfaces permitem também a utilização de métodos estáticos, ou seja, eles não tem relação com as classes que implementam a interface,
   logo, não serão sobrescritos por elas.
 */
public class A087_Interfaces {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        // Usando os métodos abstratos da interface.
        databaseLoader.load();
        fileLoader.load();
        System.out.println("++++++++++++++++++++++++++");

        // Usando os métodos default
        databaseLoader.removeData();
        fileLoader.removeData();
        System.out.println("++++++++++++++++++++++++++");

        // Obtendo o atributo da interface.
        System.out.println("Max data by interface: " + IDataRemover.getMaxDataSize());
        System.out.println("Max data by class: " + DatabaseLoader.getMaxDataSize());
    }
}
