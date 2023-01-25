package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.domain.Sale;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.PaymentMethodEnum;

/* As enumerações são compostas por constantes e essas constantes podem ter valores predefinidos, passados para os atributos
   da enumeração, pelo construtor.
   Através dos atritutos, é possível retornar valores recuperados pela enumeração, como um código ou uma descrição.
 */
public class A82_Enumarations {
    public static void main(String[] args) {
        Client client = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);
        Sale sale = new Sale(client, 60, PaymentMethodEnum.DEBIT);

        System.out.println(client);
        System.out.println(sale);
    }
}
