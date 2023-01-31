package com.paulo.devdojo.m03_exceptions.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing read 2.");
    }
}
