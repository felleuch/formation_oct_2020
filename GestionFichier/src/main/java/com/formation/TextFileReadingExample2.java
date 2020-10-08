package com.formation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
reads a text file with assumption that the encoding is UTF-16
 */

public class TextFileReadingExample2 {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
