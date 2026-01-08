package Methods.Level3;
import java.util.*;

public class _3_CharacterFrequencyASCII {

    public static String[][] characterFrequency(String str) {
        int[] freq = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        // Count how many characters have frequency > 0
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
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