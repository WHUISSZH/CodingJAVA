import java.util.Scanner;

/**
 * @author callmezh
 * 测试类
 */
public class TestCircleRectangle {
    void printResult(){
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(2);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println("\nEnter the new radius: ");
        Scanner input = new Scanner(System.in);
        double newRadius = input.nextDouble();
        circle.setRadius(newRadius);
        System.out.println("The new radius is " + circle.getRadius());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perime is " + rectangle.getPerimter());
    }
}
