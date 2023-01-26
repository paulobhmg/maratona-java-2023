package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Car;

public class A63_BlocosDeInicializacaoEstaticos {
    public static void main(String[] args) {
        System.out.println("MaxSpeed for cars: " + Car.getMaxSpeed());

        Car tcross = new Car("Wolkswagem", "T-Cross", "cinza", 2024);
        Car polo = new Car("Wolkswagem", "Polo", "branco", 2024);

        System.out.println(tcross);
        System.out.println(polo);

        System.out.println(tcross);
        System.out.println(polo);
    }
}
