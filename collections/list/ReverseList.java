import java.util.*;
import java.util.stream.*;

public class ReverseList {

    static void reverse(ArrayList<Integer> list) {
        int start = 0, end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        reverse(list);
        System.out.println(list);
        LinkedList<Integer> ll = new LinkedList<>(list);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}