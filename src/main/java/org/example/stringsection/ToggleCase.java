package stringsection;

public class ToggleCase {
    public static void main(String[] args) {
        String input = "java programming";
        String[] arr = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    sb.append(word.charAt(i));
                }
            }
            sb.append(" ");
            result.append(sb);
        }
        System.out.println(result.toString().trim());
    }
}
