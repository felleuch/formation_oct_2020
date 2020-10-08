package com.formation;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OpenCSVReadEx {

    public static void main(String[] args) throws IOException,
            CsvValidationException {

        String fileName = "src/main/resources/numbers.csv";
        File f = new File(fileName);

        try (FileReader fr = new FileReader(fileName);
             CSVReader reader = new CSVReader(fr)) {

            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                for (String e : nextLine) {
                    System.out.format("%s ", e);
                }
            }
        }
    }
}