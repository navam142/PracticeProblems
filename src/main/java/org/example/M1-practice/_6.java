import java.util.ArrayList;
import java.util.List;

public class _6 {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String words = "navam naman ? shahs";
        List<String> result = new ArrayList<>();
        String[] arr = words.split(" ");
        for (String word : arr) {
            if (isPalindrome(word)) {
                result.add(word);
            }
        }
        System.out.println(result);
    }
}
