package Methods.Level3;

import java.util.Scanner;

public class _1_UniqueCharacters {

    public static int stringLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return len;
    }

    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                for (int j = 0; j < i; j++) {
                    if (str.charAt(j) == ch) {
                        isUnique = false;
                        break;
                    }
                }
            }

            if (isUnique) {
                unique[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] unique = uniqueCharacters(str);

        if (unique.length == 0) {
            System.out.println();
        } else {
            for (int i = 0; i < unique.length; i++) {
                System.out.print(unique[i]);
                if (i < unique.length - 1) System.out.print("");
            }
            System.out.println();
        }
        sc.close();
    }
}