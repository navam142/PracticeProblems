package stringsection;

import java.util.*;

public class FirstRepeatedString {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "c++", "java", "c", "python"};
        Set<String> set = new HashSet<>();
        for (String word : arr) {
            if (!set.add(word)) {
                System.out.println(word);
                break;
            }
        }
    }
}
