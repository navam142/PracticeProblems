package org.jsonhandling.practiceproblems;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.io.File;

class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private List<String> skills;
    private Map<String, String> address; // city, zip

    public User(int id, String name, int age, String email, List<String> skills, Map<String, String> address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.skills = skills;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public List<String> getSkills() {
        return skills;
    }
    public Map<String, String> getAddress() {
        return address;
    }
}



public class ReadAndExtract {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(new File("src\\main\\java\\org\\jsonfiles\\user.json"), User.class);
            System.out.println("name : " + user.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
