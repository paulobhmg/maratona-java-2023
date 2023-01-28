package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.IRate;

public abstract class Product implements IRate {
    protected String className = getClass().getSimpleName();
    protected String description;
    protected double price;
    protected double rate;
    public Product(){}
    public Product(String description, double price, double rate) {
        this.description = description;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public double rateCalculate() {
        return price * rate;
    }

    public String toString() {
        return String.format("%s: %s, price: %.2f", className, description, price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getClassName() {
        return className;
    }
}
