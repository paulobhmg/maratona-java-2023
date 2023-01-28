package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums;

public enum StatusOrderTypeEnum {
    WAITING(1, "Waiting to prepair"),
    PROCESSING(2, "Processing"),
    DONE(3, "Done"),
    DELETED(4, "Deleted");

    private int code;
    private String description;

    StatusOrderTypeEnum(int code, String description) {
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

    public String toString() {
        return String.format("%d - %s", code, description);
    }
}
