package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.client.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.OrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PaymentMethodEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.StatusOrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    protected static int lastOrder = 0;
    protected int orderNumber;
    protected LocalDateTime dateTime;
    protected OrderTypeEnum orderTypeEnum;
    protected ISeller clerk;
    protected Client client;
    protected List<OrderItem> orderItems;
    protected double total;
    protected StatusOrderTypeEnum status;
    protected PaymentMethodEnum paymentMethodEnum;

    {
        this.orderItems = new ArrayList<>();
        this.orderNumber = ++lastOrder;
        this.dateTime = LocalDateTime.now();
    }

    public Order() {}

    public Order(ISeller clerk) {
        this.clerk = clerk;
    }

    public Order(ISeller clerk, Client client) {
        this(clerk);
        this.client = client;
    }

    public Order(ISeller clerk, Client client, List<OrderItem> orderItems) {
        this(clerk, client);
        this.orderItems = orderItems;
    }

    public Order(ISeller clerk, Client client, List<OrderItem> orderItems, PaymentMethodEnum paymentMethodEnum) {
        this(clerk, client, orderItems);
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public boolean putProduct(OrderItem orderItem) {
        assert orderItem != null;
        return orderItems.add(orderItem);
    }
    public void putAllProducts(List<OrderItem> orderList) {
        assert orderList != null;
        this.orderItems.addAll(orderList);
    }

    public boolean removeProduct(OrderItem orderItem) {
        assert orderItem != null;
        return orderItems.removeIf(p -> orderItems.contains(p));
    }

    private double totalSaleCalculate() {
        double sum = 0;
        for(OrderItem orderItem : orderItems) {
            sum += orderItem.getTotalItem();
        }
        this.total = sum;
        return sum;
    }

    public String showOrderItems() {
        if(orderItems.size() == 0) return "No items yet";
        StringBuilder orderItemsDescription = new StringBuilder();
        for(OrderItem orderItem : orderItems) {
            orderItemsDescription.append(orderItem);
            orderItemsDescription.append("\n");
        }
        return orderItemsDescription.toString();
    }

    public String toString() {
        return String.format(
            "Order: %d - Clerk: %s, Client: %s\n" +
            "Status: " + status.getDescription() + "\n" +
            "Products: \n" +
            showOrderItems() +
            "Total: " + totalSaleCalculate()
        );
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderTypeEnum getOrderTypeEnum() {
        return orderTypeEnum;
    }

    public void setOrderTypeEnum(OrderTypeEnum orderTypeEnum) {
        this.orderTypeEnum = orderTypeEnum;
    }

    public ISeller getClerk() {
        return clerk;
    }

    public void setClerk(ISeller clerk) {
        this.clerk = clerk;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public StatusOrderTypeEnum getStatus() {
        return status;
    }

    public void setStatus(StatusOrderTypeEnum status) {
        this.status = status;
    }

    public PaymentMethodEnum getPaymentMethodEnum() {
        return paymentMethodEnum;
    }

    public void setPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum) {
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public static int getLastOrder() {
        return lastOrder;
    }
}
