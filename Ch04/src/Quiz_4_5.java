import java.util.Scanner;

import static java.lang.StrictMath.tan;

public class Quiz_4_5 {
    public void computeCover(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numOfSide = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double cover = numOfSide * side * side / (4 * tan(Math.PI / numOfSide));
        System.out.printf("The area of the polygon is %2.4f", cover);
    }
}
