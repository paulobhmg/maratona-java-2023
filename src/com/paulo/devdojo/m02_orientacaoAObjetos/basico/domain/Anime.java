package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
