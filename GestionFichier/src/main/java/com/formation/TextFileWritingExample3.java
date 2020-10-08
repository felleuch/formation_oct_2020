package com.formation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*

specifies specific character encoding (UTF-16) when writing to the file
 */
public class TextFileWritingExample3 {

    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("MyFile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Xin chào");
            bufferedWriter.newLine();
            bufferedWriter.write("Hẹn gặp lại!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
