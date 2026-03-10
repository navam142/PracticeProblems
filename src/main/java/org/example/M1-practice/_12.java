import java.util.*;

public class _12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int currSum = 0;
        int actualSum = 0;
        for (int i : arr) {
            currSum += i;
        }
        for (int i = 1; i <= max; i++) {
            actualSum += i;
        }
        System.out.println(actualSum - currSum);
    }
}