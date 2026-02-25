package arraysection;

public class RotationPalindrome {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static String rotate(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
    public static void main(String[] args) {
        String s = "navam";
        int i = 0, n = s.length();
       
        while (i < n) {
            s = rotate(s);
            System.out.println("checking : " + s);
            if (isPalindrome(s)) {
                System.out.println(true);
                System.exit(0);
            }
            i++;
        }
        System.out.println(false);
    }
}
