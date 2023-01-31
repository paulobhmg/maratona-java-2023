package com.paulo.devdojo.m03_exceptions.domain;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

public class Reader1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing read 1.");
    }

    public void genericException() throws SQLException, IOException {
        System.out.println("generic exception Reader 1");
    }
}
