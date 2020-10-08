package com.formation;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter is used to write two words “Hello World” and “Good Bye!” to a file named MyFile.txt
 */

public class TextFileWritingExample1 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
