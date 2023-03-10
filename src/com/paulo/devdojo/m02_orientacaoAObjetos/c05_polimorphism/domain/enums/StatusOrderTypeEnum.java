package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums;

import java.util.Objects;

public enum StatusOrderTypeEnum {

    ONLINE(1, "Open"),
    OFFLINE(0, "Closed"),
    WAITING_ITEM(3, "Waiting to prepair"),
    PROCESSING(4, "Processing"),
    DONE(5, "Done"),
    DELETED(6, "Deleted"),
    WAITING_FINISH(7, "Waiting order finishing");
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
