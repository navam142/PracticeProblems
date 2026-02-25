package arraysection;

import java.util.*;

public class LeaderElement {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> list = new ArrayList<>();
        int lead = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > lead) {
                list.add(arr[i]);
                lead = arr[i];
            }
        }
        System.out.println(list);
    }
}
