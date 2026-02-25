package arraysection;

public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 1, 9};
        int maxDiff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currDiff = arr[j] - arr[i];
                if (maxDiff < currDiff) {
                    maxDiff = currDiff;
                }
            }
        }
        System.out.println(maxDiff);
    }
}
