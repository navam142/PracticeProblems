package Level2PracticeProblems;

import java.util.Scanner;

public class _4_TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        sc.close();
    }
}
