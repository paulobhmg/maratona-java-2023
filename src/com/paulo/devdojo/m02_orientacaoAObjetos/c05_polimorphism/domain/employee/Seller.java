package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.OrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.StatusOrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.OrderItem;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.util.ArrayList;
import java.util.List;

public class Seller extends Employee implements ISeller {
    protected double commission;
    protected List<Order> orderList;
    protected double totalSale;

    {
        this.orderList = new ArrayList<>();
    }

    public Seller() {
    }

    public Seller(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary) {
        super(name, personTypeEnum, age, gender, salary);
    }

    public Seller(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary, double commission, List<Order> orderList, double totalSale) {
        super(name, personTypeEnum, age, gender, salary);
        this.commission = commission;
        this.orderList = orderList;
        this.totalSale = totalSale;
    }

    @Override
    public void openOrder(Order order, OrderTypeEnum orderTypeEnum) {
        orderList.add(order);
        order.setClerk(this);
        order.setStatus(StatusOrderTypeEnum.ONLINE);
        order.setOrderTypeEnum(orderTypeEnum);
    }
    @Override
    public void closeOrder(Order order) {
        switch (order.getStatus()) {
            case DONE:
                System.out.printf("Finishing order %d - R$: %.2f\n", order.getOrderNumber(), order.getTotal());
                break;
            default:
                System.out.printf("Order %d was not finished yet.", order.getOrderNumber());
        }
    }

    @Override
    public void sell(Order order, OrderItem orderItem) {
        orderItem.setClerk(this);
        order.putProduct(orderItem);
    }

    @Override
    public void sell(Order order, List<OrderItem> orderItems) {
        order.putAllProducts(orderItems);
    }

    @Override
    public void cancel(Order order, OrderItem orderItem) {
        order.removeProduct(orderItem);
        totalSale -= orderItem.getTotalItem();
    }

    @Override
    public double commissionCalcule() {
        if(orderList.size() == 0) return 0;
        double sum = 0;
        for(Order order : orderList) {
            sum += order.getTotal();
        }
        totalSale = sum;
        return sum * commission;
    }
}
