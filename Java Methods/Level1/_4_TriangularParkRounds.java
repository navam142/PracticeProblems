import java.util.Scanner;

public class _4_TriangularParkRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        
        double rounds = calculateRounds(side1, side2, side3);
        
        System.out.println((int)Math.ceil(rounds));
        sc.close();
    }
    
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distanceInMeters = 5000;
        return distanceInMeters / perimeter;
    }
}