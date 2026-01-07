import java.util.Scanner;

public class _3_MaximumHandshakesDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        
        long handshakes = (numberOfStudents * (numberOfStudents - 1L)) / 2;
        
        System.out.println(handshakes);
        sc.close();
    }
}