package com.formation;

import java.io.IOException;
import java.nio.file.*;

public class CopyFilesNIO {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }

        String inputFile = args[0];
        String outputFile = args[1];


        try {
            long start = System.currentTimeMillis();

            byte[] allBytes = Files.readAllBytes(Paths.get(inputFile));
            Files.write(Paths.get(outputFile), allBytes);

            long end = System.currentTimeMillis();
            System.out.println("Copied in " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
