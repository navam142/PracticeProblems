import java.util.*;

public class _7 {
    public static void main(String[] args) {
        String s = "Navam";
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
