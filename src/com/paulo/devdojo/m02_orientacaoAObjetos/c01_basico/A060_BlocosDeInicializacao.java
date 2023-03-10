package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Anime;
import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Episode;

public class A060_BlocosDeInicializacao {
    public static void main(String[] args) {
        Anime bleach = new Anime("Bleach", 360);
        Anime dragonBall = new Anime("Dragon ball Z", 500);

        Episode fightDragonBall = new Episode(10, "Fight between Goku and Madimbu", "Fight dragonball");
        Episode fightBleach = new Episode(11, "Fight between Ichigo and Ayzen", "Fight bleach");

        System.out.println(bleach.showEpisodes());

        System.out.println(bleach);
        System.out.println(dragonBall);
        System.out.println("-----------------------------------------");

        System.out.println("Add bleach: " + bleach.add(fightBleach));
        System.out.println("Add dragon ball: " + dragonBall.add(fightDragonBall));
        System.out.println("-----------------------------------------");

        System.out.println(bleach.showEpisodes());
        System.out.println(dragonBall.showEpisodes());
    }
}
