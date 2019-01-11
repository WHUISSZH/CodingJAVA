import java.util.Scanner;

public class Quiz_3_27 {
    public static void checkPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double point_x = input.nextDouble();
        double point_y = input.nextDouble();
        double border_y = -0.5 * point_x + 100;
        if (point_x < 0 || point_y <0){
            System.out.print("Point (" + point_x + "," + point_y + ") is not in the triangle");
        }else if (point_x > 200 || point_y > border_y){
            System.out.print("Point (" + point_x + "," + point_y + ") is not in the triangle");
        }else
            System.out.print("Point (" + point_x + "," + point_y + ") is in the triangle");
    }
}
