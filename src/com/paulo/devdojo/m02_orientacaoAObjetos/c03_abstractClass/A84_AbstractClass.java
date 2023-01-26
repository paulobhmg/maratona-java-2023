package com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass;

import com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass.domain.Manager;
import com.paulo.devdojo.m02_orientacaoAObjetos.c03_abstractClass.domain.Seller;

public class A84_AbstractClass {
    public static void main(String[] args) {
        Manager manager = new Manager("Paulo", 30, 'M', 20000);
        Seller seller = new Seller("Pedro", 40, 'M', 3000);

        System.out.println(manager);
        System.out.println(seller);
    }

}
