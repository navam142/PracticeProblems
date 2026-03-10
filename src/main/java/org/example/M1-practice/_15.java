public class _15 {
    public static void main(String[] args) {
        String word = "jasdbfbasdfkjhabsdfbasdf";
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0)).append(word.substring(1, word.length() - 1).length()).append(word.charAt(word.length() - 1));
        System.out.println(sb.toString());
    }
}
