package Methods.Level3;
import java.util.Scanner;

public class _2_FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String str) {
        int[] freq = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result = firstNonRepeating(str);

        if (result == '\0') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}