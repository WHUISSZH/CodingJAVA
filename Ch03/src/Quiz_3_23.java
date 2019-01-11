import java.util.Scanner;

public class Quiz_3_23 {
    public static void checkPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double point_x = input.nextDouble();
        double point_y = input.nextDouble();
        if (Math.abs(point_x) > 5 || Math.abs(point_y) > 2.5){
            System.out.print("Point (" + point_x + "," + point_y + ") is not in the rectangle");
        }else
            System.out.print("Point (" + point_x + "," + point_y + ") is in the rectangle");
    }
}
