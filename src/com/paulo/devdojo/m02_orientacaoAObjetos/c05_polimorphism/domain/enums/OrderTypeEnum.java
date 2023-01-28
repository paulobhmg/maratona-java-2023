package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Tablet;

public enum OrderTypeEnum {
    TABLE_ORDER(1, "Table"),
    CASHIER_ORDER(2, "Cashie"),
    DELIVERY_ORDER(3, "Delivery");
    private int code;
    private String description;
    OrderTypeEnum(int code, String description) {
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
