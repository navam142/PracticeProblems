import java.util.ArrayList;
import java.util.List;

public class _16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -1, -3, 4, 5, -1};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i > 0) {
                list.add(i);
            }
        }
        System.out.println(list.get((list.size() / 2) - 1));
    }
}
