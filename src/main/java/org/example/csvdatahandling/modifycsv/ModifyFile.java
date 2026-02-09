package org.example.csvdatahandling.modifycsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class ModifyFile {
    public static void main(String[] args) {
        String inputPath = "src\\main\\java\\org\\example\\csvfiles\\EmployeeData.csv";
        String outputPath = "src\\main\\java\\org\\example\\csvfiles\\UpdatedEmployeeData.csv";
        try (CSVReader csvReader = new CSVReader(new FileReader(inputPath))) {
            List<String[]> rows = csvReader.readAll();

            for (String[] row : rows) {
                String name = row[1].trim();
                if (name.equalsIgnoreCase("Navam Sharma")) {
                    double salary = Double.parseDouble(row[3]);
                    salary = salary * 1.10;
                    row[3] =  String.valueOf((long) salary);
                }
            }

            CSVWriter cw = new CSVWriter(new FileWriter(outputPath));
            cw.writeAll(rows);
            cw.close();


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

