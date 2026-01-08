package Methods.Level3;
import java.util.*;

public class _4_CharacterFrequencyUsingUnique {

    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount++] = ch;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] characterFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[][] freq = characterFrequency(str);

        for (String[] pair : freq) {
            System.out.println(pair[0] + " " + pair[1]);
        }
        sc.close();
    }
}