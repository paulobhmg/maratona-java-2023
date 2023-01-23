package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

public class Local {
    private String title;
    private String address;

    public Local() {}

    public Local(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("%s, %s", title, address);
    }
}
