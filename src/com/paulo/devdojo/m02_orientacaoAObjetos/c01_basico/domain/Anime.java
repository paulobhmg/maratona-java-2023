package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* A construção de objetos possui uma sequência de inicialização.
   1 - Alocação do espaço em memória para o objeto
   2 - Atributos são inicializados com seus valores default ou predefinidos
   3 - Os blocos de inicialização são executados
   4 - O construtor é executado.

   Os blocos de inicialização são executados sempre que um novo objeto é instanciado.
   Eles são utilizados, por exemplo, para iniciar atributo, fazendo com que não seja necessário repetir
   o mesmo código em vários construtores diferentes.
 */

public class Anime {
    private String name;
    private List<Episode> episodes;
    private int numberOfEpisodes;

    {
        episodes = new ArrayList<>();
        numberOfEpisodes = episodes.size();
    }
    public Anime() {}

    public Anime(String name) {
        this.name = name;
    }

    public Anime(String name, int numberOfEpisodes){
        this(name);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Anime(String name, List<Episode> episodes) {
        this(name);
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return episodes.size();
    }

    public boolean add(Episode episode) {
        return episodes.add(episode);
    }

    public boolean remove(Episode episode) {
        return episodes.remove(episode);
    }

    public String toString(){
        return String.format("Anime: %s, episodes: %d\n %s", name, numberOfEpisodes, showEpisodes());
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public String showEpisodes(){
        StringBuilder episodeDescription = new StringBuilder();
        if(Objects.isNull(episodes) || episodes.size() == 0) {
            return "There is not episodes for this anime";
        }
        episodeDescription.append(String.format("Anime - %s, episodes: %d\n", name, episodes.size()));
        for(Episode episode : episodes) {
            episodeDescription.append(String.format("Ep %d - %s, \nDescription: %s", episode.getEpisodeNumber(), episode.getTitle(), episode.getDescription()));
            episodeDescription.append("\n---------------------------");
        }
        return episodeDescription.toString();
    }
}
