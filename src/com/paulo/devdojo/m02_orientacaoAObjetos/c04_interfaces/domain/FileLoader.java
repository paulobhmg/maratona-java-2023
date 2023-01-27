package com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces.IDataLoader;
import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces.IDataRemover;

public class FileLoader implements IDataLoader, IDataRemover {
    @Override
    public void load() {
        System.out.println("Loading data by File.");
    }
}
