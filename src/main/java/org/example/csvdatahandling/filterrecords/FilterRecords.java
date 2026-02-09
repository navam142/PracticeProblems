package org.example.csvdatahandling.filterrecords;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\org\\example\\csvfiles\\Students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                int marks = Integer.parseInt(nextLine[1]);
                if (marks > 80) {
                    System.out.println("student : " + nextLine[0] + "marks : " + nextLine[1]);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            throw new RuntimeException(e);

        }
    }
}
