package com.corestocy.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file); // This throws FileNotFoundException
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e);
        }
    }
}

