package javaiostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\users\\navam\\desktop\\Practice-Problems\\javaiostreams\\files\\hello.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("C:\\users\\navam\\desktop\\Practice-Problems\\javaiostreams\\files\\ReadWriteOutput.txt");
            String line;
            while ( (line = br.readLine()) != null) {
                fw.write(line);
            }
            fw.write("content written successfully");
            br.close();
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
