package javaiostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeEmployees {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Navam", "Engineering", 50000));
        employees.add(new Employee(2, "Aman", "HR", 40000));
        employees.add(new Employee(3, "Riya", "Finance", 45000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("employees.dat"))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

