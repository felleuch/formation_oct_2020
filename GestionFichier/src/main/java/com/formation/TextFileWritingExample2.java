package com.formation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
uses a BufferedReader that wraps a FileReader to append text to an existing file
 */
public class TextFileWritingExample2 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
