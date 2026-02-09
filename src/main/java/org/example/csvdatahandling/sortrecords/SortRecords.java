package org.example.csvdatahandling.sortrecords;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

class Record {
    String name;
    Double salary;
    public Record(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortRecords {
    public static void main(String[] args) {
        String input = "src\\main\\java\\org\\example\\csvfiles\\EmployeeData.csv";
        try (CSVReader cr = new CSVReader(new FileReader(input))) {

            List<String[]> list = cr.readAll();
            List<Record> records = new ArrayList<>();
            for (String[] row : list) {
                records.add(new Record(row[1], Double.parseDouble(row[3])));
            }
            records.sort((r1, r2) -> Double.compare(r1.salary, r2.salary));
            for (Record record : records) {
                System.out.print(record.name + " " + record.salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
