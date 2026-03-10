import java.util.*;

public class _8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 1, 4};
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(result.toString());
    }
}
