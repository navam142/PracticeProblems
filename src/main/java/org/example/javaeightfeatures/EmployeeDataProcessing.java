package org.example.javaeightfeatures;

import java.util.*;
import java.util.stream.*;


class Employee {
    int id;
    String name;
    String department;
    double salary;

    // constructor, getters, setters
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}


public class EmployeeDataProcessing {
    public static Map<String, Double> processEmployees(List<Employee> employees) {

        return employees.stream()

                // 1. Filter
                .filter(e -> "Engineering".equals(e.getDepartment()))
                .filter(e -> e.getSalary() > 80_000)

                // 2. Sort (descending salary)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())

                // 3 & 4. Group + Average
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }
}
