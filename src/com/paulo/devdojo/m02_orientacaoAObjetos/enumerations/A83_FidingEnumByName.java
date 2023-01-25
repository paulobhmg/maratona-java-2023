package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations;

import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.ClientTypeEnum;

public class A83_FidingEnumByName {
    public static void main(String[] args) {
        ClientTypeEnum clientType = ClientTypeEnum.valueOf("PHISICAL_PERSON");
        System.out.println(clientType);

        ClientTypeEnum clientFound = ClientTypeEnum.findByName("legal person");
        ClientTypeEnum clientNotFound = ClientTypeEnum.findByName("legall person");

        System.out.println(clientFound);
        System.out.println(clientNotFound);
    }
}
