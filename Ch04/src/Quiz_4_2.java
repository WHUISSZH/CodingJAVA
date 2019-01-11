import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Quiz_4_2 {
    public void computeCircle(){
        final double RADIANS_EARTH = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point1 (lat and long) in degrees(123, 23): ");
        String point1DegreeStr = input.nextLine();
        System.out.print("Enter point2 (lat and long) in degrees(123, 23): ");
        String point2DegreeStr = input.nextLine();

        int index1 = point1DegreeStr.indexOf(',');
        int index2 = point2DegreeStr.indexOf(',');
        double point1DegreeLat = Double.parseDouble(point1DegreeStr.substring(0,index1));
        double point1DegreeLong = Double.parseDouble(point1DegreeStr.substring(index1 + 2));
        double point2DegreeLat = Double.parseDouble(point2DegreeStr.substring(0,index2));
        double point2DegreeLong = Double.parseDouble(point2DegreeStr.substring(index2 + 2));

        double point1RadiansLat = Math.toRadians(point1DegreeLat);
        double point1RadiansLong = Math.toRadians(point1DegreeLong);
        double point2RadiansLat = Math.toRadians(point2DegreeLat);
        double point2RadiansLong = Math.toRadians(point2DegreeLong);

        double d = RADIANS_EARTH * acos(
                sin(point1RadiansLat) * sin(point2RadiansLat) + cos(point1RadiansLat) * cos(point2RadiansLat) * cos(point1RadiansLong - point2RadiansLong));
        System.out.printf("The distance between the two points is %f", d);
    }
}
