package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums;

public enum PaymentMethodEnum {
    DEBIT(1, "Debit"),
    CREDIT(2, "Credit"),
    MONEY(3, "Money");

    private int code;
    private String description;

    PaymentMethodEnum(int code, String description){
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
