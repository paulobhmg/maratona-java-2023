package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.ClientTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.Person;

public class Client extends Person {
    protected String name;
    protected String type;

    protected ClientTypeEnum clientType;
    protected final String PHISIC_PERSON = "PHISICAL PERSON";
    protected final String CORPORATIVE_PERSON = "CORPORATIVE PERSON";

    public Client() {
    }

    public Client(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Client(String name, String type, String nothing) {
        if (!type.equals(PHISIC_PERSON) && !type.equals(CORPORATIVE_PERSON)) return;
        this.name = name;
        this.type = type;
    }

    public Client(String name, ClientTypeEnum type) {
        this.name = name;
        this.clientType = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClientTypeEnum getClientType() {
        return clientType;
    }

    public void setClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
    }

    public String toString() {
        return (String.format("%s, type: %s, typeEnum: %s", name, type, clientType));
    }
}
