public class _1 {
    public static void main(String[] args) {
        int n = 4;
        String s = "M1";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}