package Methods.Level1;

import java.util.Scanner;

public class _1_CompareStrings {

    static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        System.out.println(compareStrings(s1, s2));
    }
}
