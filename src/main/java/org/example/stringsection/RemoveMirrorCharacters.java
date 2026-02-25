package stringsection;

public class RemoveMirrorCharacters {

    static String getResult(String str) {
        if (!isPalindrome(str)) {
            return str;
        }
        return str.substring(0, str.length() / 2);
    }

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

    public static void main(String[] args) {
        String inp1 = "abcabc";
        String inp2 = "xyyx";

        String result1 = getResult(inp1);
        String result2 = getResult(inp2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
