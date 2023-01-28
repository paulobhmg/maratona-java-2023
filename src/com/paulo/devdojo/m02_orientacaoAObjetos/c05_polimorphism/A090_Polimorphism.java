package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Computer;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.service.Report;
import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.product.Tablet;
public class A090_Polimorphism {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel I5", 3000, 0.05);
        Tablet tablet = new Tablet("Samsung A8", 1499, 0.045);

        System.out.println(computer);
        System.out.println(tablet);
        System.out.println("---------------------");

        Report.print(computer, tablet);
    }
}
