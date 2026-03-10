import java.util.*;

public class _4 {
    public static void main(String[] args) {
        String s = "ksjdlbfakjbdfkjadsbhihebr";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char result = 'a';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }
}
