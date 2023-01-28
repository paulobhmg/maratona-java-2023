package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.OrderTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.OrderItem;

import java.util.List;

public interface ISeller {
    void openOrder(Order order, OrderTypeEnum orderTypeEnum);
    void closeOrder(Order order);
    void sell(Order order, OrderItem orderItem);
    void sell(Order order, List<OrderItem> orderList);
    void cancel(Order order, OrderItem orderItem);
    double commissionCalcule();
}