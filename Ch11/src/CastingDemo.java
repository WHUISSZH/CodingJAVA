/**
 * @author callmezh
 * instanceof应用举例
 */
public class CastingDemo {
    public static void displayObject(Object object){
        if (object instanceof CircleFromSimpleGeometricObject){
            System.out.println("The circle area is " +
                    ((CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " +
                    ((CircleFromSimpleGeometricObject)object).getDiameter());
        }else if (object instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The rectangle area is " +
                    ((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}