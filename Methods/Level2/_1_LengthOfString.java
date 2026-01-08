package Methods.Level2;

import java.util.Scanner;

public class _1_LengthOfString {

    static int getLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {


        }
        return i;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("length of String: " + getLength(s));
        
    }
}
