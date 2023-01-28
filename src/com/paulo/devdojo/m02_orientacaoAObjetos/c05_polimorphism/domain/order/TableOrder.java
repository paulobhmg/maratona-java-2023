package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.client.Client;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PaymentMethodEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.util.List;

public class TableOrder extends Order {
    public TableOrder() {
    }

    public TableOrder(ISeller clerk) {
        super(clerk);
    }

    public TableOrder(ISeller clerk, Client client) {
        super(clerk, client);
    }

    public TableOrder(ISeller clerk, Client client, List<OrderItem> orderItems) {
        super(clerk, client, orderItems);
    }

    public TableOrder(ISeller clerk, Client client, List<OrderItem> orderItems, PaymentMethodEnum paymentMethodEnum) {
        super(clerk, client, orderItems, paymentMethodEnum);
    }
}
