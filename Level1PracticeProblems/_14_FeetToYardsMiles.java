package Level1PracticeProblems;

import java.util.Scanner;

public class _14_FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance " + distanceInFeet + " feet is " + yards + " yards and " + miles + " miles");
    }
}