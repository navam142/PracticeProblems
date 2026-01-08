package Methods.Level2;
import java.util.Scanner;

public class _2_SplitWordsAndCompare {
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
                if (inWord) {
                    spaceIndices[idx++] = i;
                }
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                spaceIndices[idx - 1] = i - (idx > 1 ? 1 : 0);
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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        String[] customWords = splitWords(text);
        String[] builtInWords = text.trim().split("\\s+");
        
        boolean areEqual = compareArrays(customWords, builtInWords);
        
        for (String word : customWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        
        for (String word : builtInWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        
        System.out.println(areEqual);
        sc.close();
    }
}