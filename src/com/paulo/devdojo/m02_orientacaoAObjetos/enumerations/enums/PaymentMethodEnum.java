package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums;

public enum PaymentMethodEnum {
    DEBIT(1, "Debit") {
        public double discountCalcule(double value) {
            setDiscount(value * 0.1);
            return value * 0.9;
        }
    },
    CREDIT(2, "Credit"){
        public double discountCalcule(double value) {
            setDiscount(value * 0.05);
            return value * 1.05;
        }
    },
    MONEY(3, "Money") {
        public double discountCalcule(double value) {
            setDiscount(value * 0.1);
            return value * 0.9;
        }
    };

    private int code;
    private String description;
    private double discount;

    PaymentMethodEnum(int code, String description){
        this.code = code;
        this.description = description;
    }

    public abstract double discountCalcule(double value);

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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
