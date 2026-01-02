package Level2PracticeProblems;

import java.util.Scanner;

public class _8_SampleProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        int fromToVia = sc.nextInt();
        int viaToFinalCity = sc.nextInt();

        int timeTaken = sc.nextInt();

        int totalDistance = fromToVia + viaToFinalCity;
        int averageSpeed = totalDistance / timeTaken;

        System.out.println("Mr./Ms. " + name + " is travelling from " + fromCity +
                " to " + toCity + " via " + viaCity);
        System.out.println("The total distance is " + totalDistance + " Miles");
        System.out.println("The average speed is " + averageSpeed + " Miles/hour");
    }
}