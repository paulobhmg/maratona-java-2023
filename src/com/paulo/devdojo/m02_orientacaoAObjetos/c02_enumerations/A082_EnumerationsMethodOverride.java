package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee.Waiter;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;

public class A082_EnumerationsMethodOverride {
    public static void main(String[] args) {
        Client client = new Client("Paulo", ClientTypeEnum.PHISICAL_PERSON);
        Waiter waiter = new Waiter("Pedro", PersonTypeEnum.PHISICAL_PERSON, 30, 'M', 3000, 0.5);
        Order bed = new Order(waiter, client);
        Order motorcycle = new Order(waiter, client);
        Order club = new Order(waiter, client);

        System.out.println(bed);
        System.out.println(motorcycle);
        System.out.println(club);
    }
}
