package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.enums.PersonTypeEnum;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.Order;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces.ICordenation;

import java.util.ArrayList;
import java.util.List;

public class Cordenator extends Seller implements ICordenation {
    private List<Employee> employeeList;

    {
        this.employeeList = new ArrayList<>();
    }

    public Cordenator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Cordenator(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary, List<Employee> employeeList) {
        super(name, personTypeEnum, age, gender, salary);
        this.employeeList = employeeList;
    }

    public Cordenator(String name, PersonTypeEnum personTypeEnum, int age, char gender, double salary, double commission, List<Order> orderList, double totalSale, List<Employee> employeeList) {
        super(name, personTypeEnum, age, gender, salary, commission, orderList, totalSale);
        this.employeeList = employeeList;
    }

    @Override
    public boolean contract(Employee employee) {
        return employeeList.add(employee);
    }

    @Override
    public boolean drop(Employee employee) {
        return employeeList.remove(employee);
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
