package collections.map;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");
        
        String[] words = text.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(freq); 
    }
}
