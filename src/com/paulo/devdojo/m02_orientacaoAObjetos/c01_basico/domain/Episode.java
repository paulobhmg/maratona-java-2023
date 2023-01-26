package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain;

public class Episode {
    private int episodeNumber;
    private String title;
    private String description;


    public Episode() {}

    public Episode(int episodeNumber, String title){
        this.episodeNumber = episodeNumber;
        this.title = title;
    }

    public Episode(int episodeNumber, String title, String description){
        this(episodeNumber,title);
        this.description = description;
    }

    public String toString() {
        return String.format("Episode %d - %s, \nDescription: %s", episodeNumber, title, description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}
