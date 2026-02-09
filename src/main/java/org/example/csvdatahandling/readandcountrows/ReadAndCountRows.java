package org.example.csvdatahandling.readandcountrows;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ReadAndCountRows {
    public static void main(String[] args) {
        String inputPath = "src\\main\\java\\org\\example\\csvfiles\\example.csv";

        try (
                CSVReader csvReader = new CSVReader(new FileReader(inputPath));
        ) {
            String[] nextLine;
            int count = 0;
            while ((nextLine = csvReader.readNext()) != null) {
                for (String row : nextLine) {
                    System.out.print(row);
                }
                System.out.println();
                count++;
            }
            System.out.println("total rows : " + count);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
