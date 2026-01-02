package Level1PracticeProblems;

public class _7_EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14159265359;
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}
