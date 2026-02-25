package stringsection;
import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String input = "abcabcbb";
        int left = 0, right = 0, n = input.length();
        
        int maxLen = 0;
        String possibleAnswer = " ";
        while (right < n) {
            char rightChar = input.charAt(right);
            if (set.contains(rightChar)) {
                int currLen = right - left + 1;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    possibleAnswer = input.substring(left, right);
                }
                while (set.contains(rightChar)) {
                    set.remove(input.charAt(left));
                    left++;
                }
            }
            set.add(rightChar);
            right++;
        }
        System.out.println(possibleAnswer);
    }
}
