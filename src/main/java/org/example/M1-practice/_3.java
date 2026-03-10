public class _3 {
    public static void main(String[] args) {
        String s = "10110111";
        String[] arr = s.split("0");
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            int x = 0;
            for (char ch : word.toCharArray()) {
                x += ch - '0';
            }
            char ch = (char) (x - 1 + 'a');
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
