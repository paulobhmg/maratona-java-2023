package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Product;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.time.LocalDateTime;

public class OrderItem {
    private Order order;
    private LocalDateTime dateTime;
    private Product product;
    private double quantity;
    private ISeller clerk;
    public OrderItem() {}
    public OrderItem(Order order, LocalDateTime dateTime, Product product, double quantity, ISeller clerk) {
        this.order = order;
        this.dateTime = dateTime;
        this.product = product;
        this.quantity = quantity;
        this.clerk = clerk;
    }

    public double getTotalItem() {
        return product.getPrice() * quantity + getRateApplied();

    }
    public double getRateApplied() {
        return product.getPrice() * product.getRate() * quantity;
    }

    public String toString() {
        return String.format("%s, Quantity: %.1f, rate: %.2f%%, app: %.2f, total with rate: %.2f",
            product, quantity, product.getRate(), getRateApplied(), getTotalItem());
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public ISeller getClerk() {
        return clerk;
    }

    public void setClerk(ISeller clerk) {
        this.clerk = clerk;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
