import java.util.Scanner;

public class Quiz_3_34 {
    public void checkPoint(){
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
            if ((p2_x >= p0_x && p2_x <= p1_x) && (p2_y >= p0_y && p2_y <= p1_y)){
                System.out.print("(" + p2_x + ","+ p2_y + ")" + " is on the line segment from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
            }else
                System.out.print("(" + p2_x + ","+ p2_y + ")" + " is  not on the line segment from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
        }else
            System.out.print("(" + p2_x + ","+ p2_y + ")" + " is  not on the line segment from " + "(" + p0_x + ","+ p0_y + ")" + " to " + "(" + p1_x + ","+ p1_y + ")");
    }
}
