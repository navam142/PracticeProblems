package collections.que;

import java.util.*;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int data = q.remove();
        reverse(q);
        q.add(data);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverse(q);
        System.out.println(q); 
    }
}
