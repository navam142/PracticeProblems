package org.jsonhandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
    public String name;
    public Integer age;
    public String[] subjects;


    Student (String name, Integer age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Student navam = new Student("Navam", 21, new String[] {"Core Java", "DSA"});
        Student sharma = new Student("Sharma", 21, new String[] {"Java", "C#"});

        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonStringOfNavam = mapper.writeValueAsString(navam);
            String  jsonStringOfSharma = mapper.writeValueAsString(sharma);

            System.out.println( jsonStringOfNavam);
            System.out.println( jsonStringOfSharma);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            throw new RuntimeException(e);
        }

    }
}
