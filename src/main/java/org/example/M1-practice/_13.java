public class _13 {
    public static void main(String[] args) {
        String s = "Navam";
        int uc = 0;
        int lc = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uc++;
            } else {
                lc++;
            }
        }
        String result =  uc > lc ? s.toUpperCase() : s.toLowerCase();
        System.out.println(result);
    }
}
