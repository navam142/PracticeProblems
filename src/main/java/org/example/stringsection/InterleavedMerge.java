package stringsection;

public class InterleavedMerge {

    static String merge(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(j));
            i++;
            j++;
        }

        if (i < s1.length()) {
            result.append(s1.substring(i));
        }

        if (j < s2.length()) {
            result.append(s2.substring(j));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "XYZ";

        String merged = merge(s1, s2);
        System.out.println(merged);
    }
}
