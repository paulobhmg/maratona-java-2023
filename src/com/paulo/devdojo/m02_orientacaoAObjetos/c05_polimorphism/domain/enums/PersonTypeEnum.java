package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums;

public enum PersonTypeEnum {
    PHISICAL_PERSON(1, "Phisical Person"),
    LEGAL_PERSON(2, "Legal Person");
    private int code;
    private String description;
    PersonTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
