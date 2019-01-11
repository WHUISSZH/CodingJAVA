/**
 * @author callmezh
 */
public class InvalidRadiusException extends Exception{
    private double radius;

    /**
     * Construct an exception
     */
    public InvalidRadiusException(double radius){
        //调用Exception父类有参构造方法
        super("Invalid radius" + radius);
        this.radius = radius;
    }

    /**
     * Return the radius
     */
    public double getRadius(){
        return radius;
    }
}