package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Product;

public interface ISeller {
    void sell(Product product);
    void cancel(Product product);
    double commissionCalcule();
}