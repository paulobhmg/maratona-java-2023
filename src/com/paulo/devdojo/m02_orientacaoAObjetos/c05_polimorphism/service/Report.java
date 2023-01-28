package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.service;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Product;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Tablet;

public abstract class Report {
    public static void print(Product... products){
        for(Product product : products){
            System.out.print(product);
            if(product instanceof Tablet) {
                System.out.print(", memory: " + ((Tablet) product).getMemory());
            }
            System.out.println();
        }
    }
}
