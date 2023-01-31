package com.paulo.devdojo.m03_exceptions.domain;

import java.io.FileNotFoundException;
import java.sql.SQLNonTransientException;

public class Reader2 extends Reader1{
    @Override
    public void close()  {
        System.out.println("Closing read 2.");
    }

    @Override
    public void genericException() throws FileNotFoundException, SQLNonTransientException {
        System.out.println("Especifical exception read 2.");
    }
}
