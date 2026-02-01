import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "mangu", "banana", "melon"));
        Map<String, Integer> freq= new HashMap<>();
        for (String fruit : fruits) {
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);
        }
        System.out.println(freq);
    }    
}
