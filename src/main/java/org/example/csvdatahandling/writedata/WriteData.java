package org.example.csvdatahandling.writedata;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) {

        String inputPath = "src\\main\\java\\org\\example\\csvfiles\\EmployeeData.csv";
        String outputPath = "src\\main\\java\\org\\example\\csvfiles\\WrittenEmployeeData.csv";

        try (
           CSVReader reader = new CSVReader(new FileReader(inputPath));
           FileWriter fw = new FileWriter(outputPath);
        ) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                fw.write(String.join(",", line));
                fw.write(System.lineSeparator());
            }
            System.out.println("data written successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
