package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;

/* Utilizamos enumerações quando é necessário limitar as entradas de dados que o usuário poderá passar para o sistema.
   Isso nos garante a consistência dos dados, tendo em vista que sem uma limitação na passagem dos dados, pode haver diferenças
   entre os dados informados.
   Portanto, quando há uma lista de itens predefinidos, é interessante utilizar enumerações a fim de evitar que sejam passados
   valores diferentes ou inválidos.
 */
public class A080_Enumerations {
    public static void main(String[] args) {
        // Clientes instanciados sem enumeração. Aqui pode ocorrer a inconsistência de dados.
        Client client1 = new Client("Paulo", "Pessoa_fisica");
        Client client2 = new Client("Desenvolvelandia", "pessoa jurídica");
        Client client3 = new Client("Nathan", "pessoa_fisica");
        Client client4 = new Client("Diego", "Pessoa física");

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
        System.out.println("---------------------------------------------------");

        // Clientes instanciados sem enumeração, mas com validação no construtor. Isso enibe a inconsistência, mas ainda sim não é o ideal.
        Client client5 = new Client("Paulo", "PHISICAL PERSON", "");
        Client client6 = new Client("Desenvolvelandia", "CORPORATIVE PERSON", "");
        Client client7 = new Client("Nathan", "PHISICAL PERON", "");
        Client client8 = new Client("Diego", "PHISICAL PRSON", "");

        System.out.println(client5);
        System.out.println(client6);
        System.out.println(client7);
        System.out.println(client8);
        System.out.println("---------------------------------------------------");

        // Clientes instanciados utilizando uma enumeração, ou seja, apenas valores permitidos e predefinidos serão aceitos.
        Client client9 = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);
        Client client10 = new Client("Desenvolvelandia", ClientTypeEnum.LEGAL_PERSON);
        Client client11 = new Client("Nathan", ClientTypeEnum.PHISICAL_PERSON);
        Client client12 = new Client("Diego", ClientTypeEnum.PHISICAL_PERSON);

        System.out.println(client9);
        System.out.println(client10);
        System.out.println(client11);
        System.out.println(client12);
    }
}
