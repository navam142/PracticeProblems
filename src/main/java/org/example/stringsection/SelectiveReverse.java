package stringsection;

public class SelectiveReverse {
    public static void main(String[] args) {
        String input = "I love java programming very much";
        String[] arr = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++ ) {
            if (i % 2 != 0) {
                result.append(new StringBuilder(arr[i]).reverse().toString());
                result.append(" ");
            } else {
                result.append(arr[i]);
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
