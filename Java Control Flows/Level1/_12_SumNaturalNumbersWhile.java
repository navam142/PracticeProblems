package Level1;

import java.util.Scanner;

public class _12_SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0, i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Formula sum: " + formulaSum);
            System.out.println("Loop sum: " + loopSum);
            System.out.println("Both are equal? " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        sc.close();
    }

}
