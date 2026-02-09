package org.example.csvdatahandling.converttoobject;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private Integer id, age;
    private Integer marks;

    Student() {};
    Student(Integer id, String name, Integer age, Integer marks) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }

}

public class ConvertToObject {
    public static void main(String[] args) {
        String input = "src\\main\\java\\org\\example\\csvfiles\\StudentData.csv";
        try (CSVReader reader = new CSVReader(new FileReader(input))) {
            List<String[]> records = reader.readAll();
            List<Student> students = new ArrayList<>();
            for (String[] row : records) {
                students.add(new Student(Integer.parseInt(row[0]), row[1], Integer.parseInt(row[2]), Integer.parseInt(row[3])));
            }
            students.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
