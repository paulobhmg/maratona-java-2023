package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.orders.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Product;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ISeller;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements ISeller {
    private double commission;
    private double sales;
    private List<Employee> employeeList;
    private List<Order> salesList;

    {
        employeeList = new ArrayList<>();
    }

    public Manager() {
        super();
    }

    public Manager(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary) {
        super(name, personTypeEnum, age, gender, salary);
    }
    public Manager(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary, double commission) {
        super(name, personTypeEnum, age, gender, salary);
        this.commission = commission;
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

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Order> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Order> salesList) {
        this.salesList = salesList;
    }
}
