package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Sale;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.PaymentMethodEnum;

public class A082_EnumerationsMethodOverride {
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
