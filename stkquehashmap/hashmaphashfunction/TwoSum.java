package stkquehashmap.hashmaphashfunction;
import java.util.*;


public class TwoSum {
    static int[] getElements(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        System.out.println("enter " + n + " elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target sum : ");
        int target = sc.nextInt();
        sc.close();
        int[] result = getElements(arr, target);
        System.out.println("result : " + Arrays.toString(result));
    }
}
