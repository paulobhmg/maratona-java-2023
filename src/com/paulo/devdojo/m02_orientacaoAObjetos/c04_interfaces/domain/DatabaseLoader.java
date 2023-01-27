package com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.domain;

import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces.IDataLoader;
import com.paulo.devdojo.m02_orientacaoAObjetos.c04_interfaces.interfaces.IDataRemover;

public class DatabaseLoader implements IDataLoader, IDataRemover {
    @Override
    public void load() {
        System.out.println("Loading data by Database.");
    }

    public static int getMaxDataSize() {
        return IDataRemover.MAX_DATA_SIZE;
    }
}
