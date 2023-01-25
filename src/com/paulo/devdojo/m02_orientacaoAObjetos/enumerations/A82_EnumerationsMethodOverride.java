package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.domain.Sale;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.PaymentMethodEnum;

public class A82_EnumerationsMethodOverride {
    public static void main(String[] args) {
        Client client = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);
        Sale bed = new Sale(client, 3000, PaymentMethodEnum.DEBIT);
        Sale motorcycle = new Sale(client, 28000, PaymentMethodEnum.CREDIT);
        Sale club = new Sale(client, 3500, PaymentMethodEnum.MONEY);

        System.out.println(bed);
        System.out.println(motorcycle);
        System.out.println(club);
    }
}
