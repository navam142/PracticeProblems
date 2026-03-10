import java.util.*;
public class _10 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 3};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                list.add(i);
            }
        }
        for (int i = list.size(); i < arr.length; i++) {
            list.add(0);
        }

        arr = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
