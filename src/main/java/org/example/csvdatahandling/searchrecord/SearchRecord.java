package org.example.csvdatahandling.searchrecord;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class SearchRecord {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\org\\example\\csvfiles\\EmployeeData.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;

            while ((line = reader.readNext()) != null) {
                String department = line[2];
                if (department.equalsIgnoreCase("design")) {
                    System.out.println(line[1] + " " + department);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
