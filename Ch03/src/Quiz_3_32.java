import java.util.Scanner;

public class Quiz_3_32 {
    public static void checkPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, p2: ");
        double p0_x = input.nextDouble();
        double p0_y = input.nextDouble();
        double p1_x = input.nextDouble();
        double p1_y = input.nextDouble();
        double p2_x = input.nextDouble();
        double p2_y = input.nextDouble();

        double result = (p1_x - p0_x) * (p2_y - p0_y) -(p2_x - p0_x) * (p1_y - p0_y);
        if (result == 0){
            System.out.print("(" + p2_x + ","+ p2_y + ")" + " is on the line from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
        }else if (result > 0){
            System.out.print("(" + p2_x + ","+ p2_y + ")" + " is on the left side of the line from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
        }else if (result < 0){
            System.out.print("(" + p2_x + ","+ p2_y + ")" + " is on the right side of the line from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
        }
    }
}
