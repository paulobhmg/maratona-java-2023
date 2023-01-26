package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Car;

public class A42_ExercicioCarro {
    public static void main(String[] args) {
        Car tcross = new Car("Wolkswagem", "T-Cross", "Cinza", 2023);
        Car polo = new Car("Wolkswagem", "Polo", "Cinza", 2023);

        System.out.println(tcross);
        System.out.println(polo);
    }
}
