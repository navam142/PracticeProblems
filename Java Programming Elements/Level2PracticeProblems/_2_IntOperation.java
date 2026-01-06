package Level2PracticeProblems;

import java.util.Scanner;

public class _2_IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Integer operations
        int result1 = a + b * c;     // Multiplication has higher precedence than addition
        int result2 = a * b + c;     // Multiplication first, then addition
        int result3 = c + a / b;     // Division before addition
        int result4 = a % b + c;     // Modulus before addition

        // Output
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);

        sc.close();

    }
}
