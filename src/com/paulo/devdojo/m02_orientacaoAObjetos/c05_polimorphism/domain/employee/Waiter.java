package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c02_enumerations.domain.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Product;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.util.ArrayList;
import java.util.List;

public class Waiter extends Employee implements ISeller {
    private double commission;
    private List<Order> orders;

    {
        this.orders = new ArrayList<>();
    }
    public Waiter() {}
    public Waiter(String name, int age, char gender, double salary) {
        super(name, age, gender, salary);
    }
    public Waiter(String name, int age, char gender, double salary, double commission) {
        super(name, age, gender, salary);
        this.commission = commission;
    }
    @Override
    public double commissionCalc() {
        double sum = 0;
        for(double )
        return this.salary * 0.05;
    }

    @Override
    public void sell(Product product) {

    }

    @Override
    public void cancel(Product product) {

    }

    @Override
    public double commissionCalcule() {
        return 0;
    }
}
