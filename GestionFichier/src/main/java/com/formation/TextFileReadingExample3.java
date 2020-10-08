package com.formation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
uses a BufferedReader to read a text file line by line
 */

public class TextFileReadingExample3 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
