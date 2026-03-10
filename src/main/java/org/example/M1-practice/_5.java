public class _5 {
    public static void main(String[] args) {
        String s1 = "navam";
        String s2 = "mavan";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            System.exit(1);
        }

        int[] arr = new int[26];
        for (char ch : s1.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch : s2.toCharArray()) {
            arr[ch - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) {
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);;
    }
}
