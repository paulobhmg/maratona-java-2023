package com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces;

public interface IDataRemover {
    int MAX_DATA_SIZE = 10;
    default void removeData(){
        System.out.println("Removing data.");
    }
    static int getMaxDataSize() {
        return MAX_DATA_SIZE;
    }
}
