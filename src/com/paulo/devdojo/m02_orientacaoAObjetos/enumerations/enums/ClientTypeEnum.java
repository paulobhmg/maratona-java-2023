package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums;

public enum ClientTypeEnum {
    PHISICAL_PERSON(1, "Phisical person"),
    LEGAL_PERSON(2, "Legal person");

    private int code;
    private String description;

    ClientTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static ClientTypeEnum findByName(String description) {
        for (ClientTypeEnum type : values()) {
            if(type.getDescription().equalsIgnoreCase(description)) {
                return type;
            }
        }
        return null;
    }

    public String toString() {
        return String.format("Type: %d - %s", code, description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
