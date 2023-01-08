package com.paulo.devdojo.m02_orientacaoAObjetos.basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Carro;

public class A42_ExercicioCarro {
    public static void main(String[] args) {
        Carro tcross = new Carro("Wolkswagem", "T-Cross", "Cinza", 2023);
        Carro polo = new Carro("Wolkswagem", "Polo", "Cinza", 2023);

        System.out.println(tcross);
        System.out.println(polo);
    }
}
