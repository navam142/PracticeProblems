package javaiostreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ConsoleInput {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name, age, movie;
            System.out.println("enter name: ");
            name = br.readLine();
            System.out.println("enter age: ");
            age = br.readLine();
            System.out.println("enter movie: ");
            movie = br.readLine();

            br.close();
            FileWriter fr = new FileWriter("C:\\users\\navam\\desktop\\practice-problems\\javaiostreams\\files\\ConsoleOutput.txt");
            fr.write(name + "\n");
            fr.write(age + "\n");
            fr.write(movie + "\n");
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }        
    }
}