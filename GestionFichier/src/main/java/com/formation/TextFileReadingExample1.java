package com.formation;

import java.io.FileReader;
import java.io.IOException;


/*
reads every single character from the file MyFile.txt and prints all the characters to the output console
 */
public class TextFileReadingExample1 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
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
