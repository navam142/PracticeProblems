package javaiostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeEmployees {

    public static void main(String[] args) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("employees.dat"))) {

            @SuppressWarnings("unchecked")
            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

