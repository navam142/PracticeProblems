
import java.util.Scanner;
public class _2_MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long handshakes = calculateHandshakes(n);
        
        System.out.println(handshakes);
        sc.close();
    }
    
    public static long calculateHandshakes(int n) {
        return (n * (n - 1L)) / 2;
    }
}