package Level2PracticeProblems;

import java.util.Scanner;

public class _12_PoundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double kg = weight / 2.2;

        System.out.println("The weight of the person in pound is " + weight +
                " and in kg is " + kg);
    }
}