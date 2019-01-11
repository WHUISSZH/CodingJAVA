import java.util.Scanner;
import java.lang.Math;


public class Quiz_3_29 {
    public static void checkCover(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double r1_x = input.nextDouble();
        double r1_y = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double r2_x = input.nextDouble();
        double r2_y = input.nextDouble();
        double r2 = input.nextDouble();

        if (Math.sqrt(Math.pow(r1_x - r2_x, 2) + Math.pow(r1_y - r2_y, 2)) <= Math.abs(r1 - r2)){
            if (r1 <= r2){
                System.out.print("Circle1 is inside Circle2");
            }else
                System.out.print("Circle2 is inside Circle1");
        }else if (Math.sqrt(Math.pow(r1_x - r2_x, 2) + Math.pow(r1_y - r2_y, 2)) > r1 + r2) {
                System.out.print("Circle1 does not overlap circle2");
            }else
            System.out.print("Circle1 overlaps circle2");
        }
}
