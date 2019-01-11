import java.util.Scanner;

/**
 * @author callmezh
 * 测试类
 */
class Quiz11_1_TestTriangle {
    static void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of triangle' sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Quiz11_1_Triangle triangle = new Quiz11_1_Triangle(side1, side2, side3);

        System.out.print("Enter the color of the triangle: ");
        triangle.setColor(input.next());

        System.out.print("Enter the value of filled: ");
        triangle.setFilled(input.nextBoolean());

        System.out.println("Side1\tSide2\tSide3\tPerimeter\tArea\tColor\tisFilled");
        System.out.printf("%4.2f\t%4.2f\t%4.2f\t%4.2f\t%6.2f\t%6s\t%b\n",
                triangle.getSide1(), triangle.getSide2(), triangle.getSide3(), triangle.getPerimeter(), triangle.getArea(),
                triangle.getColor(), triangle.isFilled());

        System.out.print(triangle.toString());
    }
}
