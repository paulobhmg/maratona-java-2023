package com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.enumerations.enums.PaymentMethodEnum;

public class Sale {
    private Client client;
    private double price;
    private PaymentMethodEnum paymentMethodEnum;

    public Sale(Client client, double price, PaymentMethodEnum paymentMethodEnum) {
        this.client = client;
        this.price = price;
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PaymentMethodEnum getPaymentMethodEnum() {
        return paymentMethodEnum;
    }

    public void setPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum) {
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public String toString() {
        return String.format("Sale: %.2f, Client: %s - %s, Payment Method: %s, final price: %.2f, rate/discount: %.2f. ",
            price, client.getName(), client.getClientType(),paymentMethodEnum.getDescription(), paymentMethodEnum.discountCalcule(price), paymentMethodEnum.getDiscount());
    }
}
