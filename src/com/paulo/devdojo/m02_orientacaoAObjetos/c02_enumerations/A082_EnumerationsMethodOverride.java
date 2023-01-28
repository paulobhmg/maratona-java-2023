package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.PaymentMethodEnum;

public class A082_EnumerationsMethodOverride {
    public static void main(String[] args) {
        Client client = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);
        Order bed = new Order(client, 3000, PaymentMethodEnum.DEBIT);
        Order motorcycle = new Order(client, 28000, PaymentMethodEnum.CREDIT);
        Order club = new Order(client, 3500, PaymentMethodEnum.MONEY);

        System.out.println(bed);
        System.out.println(motorcycle);
        System.out.println(club);
    }
}
