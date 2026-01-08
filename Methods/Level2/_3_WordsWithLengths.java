package Methods.Level2;
import java.util.Scanner;

public class _3_WordsWithLengths {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                wordCount++;
            }
        }
        
        int[] spaceIndices = new int[wordCount + 1];
        spaceIndices[0] = -1;
        int idx = 1;
        inWord = false;
        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (inWord) spaceIndices[idx++] = i;
                inWord = false;
            } else if (!inWord) {
                inWord = true;
            }
        }
        spaceIndices[wordCount] = len;
        
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndices[i] + 1;
            int end = spaceIndices[i + 1];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        String[] words = splitWords(text);
        String[][] result = getWordsWithLengths(words);
        
        System.out.println("Word\tLength");
        for (String[] row : result) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t" + len);
        }
        sc.close();
    }
}
