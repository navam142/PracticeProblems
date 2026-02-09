package org.example.csvdatahandling.readandprintdata;

import com.opencsv.CSVReader;
import java.io.FileReader;


public class ReadAndPrintData {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src\\main\\java\\org\\example\\csvfiles\\StudentData.csv");
            CSVReader reader = new CSVReader(fr);
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println("id : " + nextLine[0] + ", name : " + nextLine[1]  + ", age : " + nextLine[2] + ", marks : " + nextLine[3]);
            }
            reader.close();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }
}
