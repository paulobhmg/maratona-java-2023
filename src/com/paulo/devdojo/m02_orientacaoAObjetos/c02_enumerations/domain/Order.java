package com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.enums.PaymentMethodEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.StatusOrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.orders.OrderItem;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private static int lastOrder = 0;
    private double orderNumber;
    private ISeller clerk;
    private Client client;
    private List<OrderItem> orderItems;
    private double total;
    private StatusOrderTypeEnum status;
    private PaymentMethodEnum paymentMethodEnum;

    {
        this.orderItems = new ArrayList<>();
        this.orderNumber = ++lastOrder;
    }

    public Order() {}
    public Order(ISeller clerk) {
        this.clerk = clerk;
    }

    public Order(ISeller clerk, List<OrderItem> orderItems) {
        this(clerk);
        this.orderItems = orderItems;
    }

    public Order(ISeller clerk, List<OrderItem> products, PaymentMethodEnum paymentMethodEnum) {
        this(clerk, products);
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public Order(ISeller clerk, Client client, List<OrderItem> orderItems, PaymentMethodEnum paymentMethodEnum) {
        this(clerk, orderItems, paymentMethodEnum);
        this.client = client;
    }

    public Order(ISeller clerk, Client client, List<OrderItem> orderItems) {
        this(clerk, orderItems);
        this.client = client;
    }

    public boolean putProduct(OrderItem orderItem) {
        assert orderItem != null;
        return orderItems.add(orderItem);
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

    public void setClerk(ISeller clerk) {
        this.clerk = clerk;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProducts(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setStatus(StatusOrderTypeEnum status) {
        this.status = status;
    }

    public void setPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum) {
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public static int getLastOrder() {
        return lastOrder;
    }
}
