import java.util.*;

class CustomQueue<T> {
    private Stack<T> stk1;
    private Stack<T> stk2;

    CustomQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    public void enque(T item) {
        stk1.push(item);
    }

    public T peek() {

        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }

        return stk2.isEmpty() ? null : stk2.peek();
    }

    public T deque() {
        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }
        return !stk2.isEmpty() ? stk2.pop() : null;
    }

}

public class _1_ImplementQueue {
    public static void main(String[] args) {
        CustomQueue<Integer> cq = new CustomQueue<Integer>();
        for (int i = 0; i < 5; i++) {
            cq.enque(i);
        }
        System.out.println(cq.peek());
    }
}