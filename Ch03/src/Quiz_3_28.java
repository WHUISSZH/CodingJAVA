import java.util.Scanner;

import static java.lang.Math.abs;

public class Quiz_3_28 {
    public static void checkCover(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x- y-coordinates, width, and height: ");
        double r1_x = input.nextDouble();
        double r1_y = input.nextDouble();
        double r1_w = input.nextDouble();
        double r1_h = input.nextDouble();
        System.out.print("Enter r2's center x- y-coordinates, width, and height: ");
        double r2_x = input.nextDouble();
        double r2_y = input.nextDouble();
        double r2_w = input.nextDouble();
        double r2_h = input.nextDouble();

        if (abs(r1_x - r2_x) <= abs(r2_w - r1_w) && abs(r1_y - r2_y) <= abs(r2_h - r1_h)){
            if (r1_h >= r2_h && r1_w >= r2_w){
                System.out.print("r2 is inside r1");
            }else
                System.out.print("r1 is inside r2");
        }else if (r1_x + r2_x > r1_w + r2_w && r1_y + r2_y > r1_h + r2_h){
            System.out.print("r2 does not overlap r1");
        }else
            System.out.print("r2 overlap r1");
    }
}