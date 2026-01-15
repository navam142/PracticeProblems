package classesandobjects.level2;

import java.util.Scanner;

public class Palindrome {
    String text;

    public Palindrome(String text)  {
        this.text = text;
        check(text);
    }

    public void check(String text) {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        Palindrome obj = new Palindrome(text);
    }
}
