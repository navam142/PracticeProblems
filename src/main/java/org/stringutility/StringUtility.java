package org.stringutility;

public class StringUtility {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String revered = new StringBuilder(str).reverse().toString();
        return str.equals(revered);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
