package Level2PracticeProblems;

import java.util.Scanner;

public class _9_TriangularParkRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        int perimeter = side1 + side2 + side3;
        int totalDistance = 5000;
        int rounds = (int) Math.ceil((double) totalDistance / perimeter);

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
