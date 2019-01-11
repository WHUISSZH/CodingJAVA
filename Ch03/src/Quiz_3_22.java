import java.util.Scanner;

public class Quiz_3_22 {
    public static void checkPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double point_x = input.nextInt();
        double point_y = input.nextInt();
        double s = Math.pow(Math.pow(point_x, 2) + Math.pow(point_y, 2), 0.5);
        if (s < 10){
            System.out.print("Point (" + point_x + "," + point_y + ") is in the circle");
        }else if (s == 10){
            System.out.print("Point (" + point_x + "," + point_y + ") is on the circle");
        }else if (s > 10){
            System.out.print("Point (" + point_x + "," + point_y + ") is not in the circle");
        }
    }
}
