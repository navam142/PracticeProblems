package org.example;

import org.example.csvdatahandling.filterrecords.FilterRecords;
import org.example.csvdatahandling.readandcountrows.ReadAndCountRows;
import org.example.csvdatahandling.readandprintdata.ReadAndPrintData;
import org.example.csvdatahandling.searchrecord.SearchRecord;
import org.example.csvdatahandling.writedata.WriteData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] arr = {};
        FilterRecords.main(arr);
        ReadAndCountRows.main(arr);
        ReadAndPrintData.main(arr);
        SearchRecord.main(arr);
        WriteData.main(arr);
    }
}