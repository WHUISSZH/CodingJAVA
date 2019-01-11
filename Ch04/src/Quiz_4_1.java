import java.util.Scanner;

public class Quiz_4_1 {
    public void computeCover(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double s = 2 * length * Math.sin(Math.PI / 5);
        double cover = 5 * s * s / (4 * Math.tan(Math.PI /5));
        System.out.printf("The area of the pentagon is %2.2f", cover);
    }
}
