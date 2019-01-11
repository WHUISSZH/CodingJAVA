import java.util.Scanner;

public class Quiz_4_7 {
    public void showCoordinat(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double ridius = input.nextDouble();
        System.out.print("Enter the number of sides: ");
        int numOfSide = input.nextInt();

        double angle = Math.toRadians(360 / numOfSide);
        System.out.println("The coordinates of five points on the pentagon are: ");
        for (int i = 0; i < numOfSide; i++){
            System.out.printf("(%3.4f, %3.4f)\n", ridius * Math.sin(angle * i), ridius * Math.cos(angle * i));
        }
    }
}
