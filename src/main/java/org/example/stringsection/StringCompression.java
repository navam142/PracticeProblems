package stringsection;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbcddd";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            char key = entry.getKey();
            result.append(key).append(value);
        }
        System.out.println(result.toString());
    }
}
