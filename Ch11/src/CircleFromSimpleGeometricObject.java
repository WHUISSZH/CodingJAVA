/**
 * @author callmezh
 * SimpleGeometricObject类的子类
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius = 10;

    public CircleFromSimpleGeometricObject(){

    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    /**
     * 重写toString 方法
     * 方法的签名及返回值类型都必须与父类一致
     */
    @Override
    public String toString(){
        return super.toString() + "radius IS " + radius;
//        return 1;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
        /**
         * this.radius = radius;
         * this.filled = filled;
         * 这是非法的，因为GeometricObject类中的color 和 filled
         * 是私有数据域，是不允许在类外访问的。只能通过访问器 与 修改器访问
         */
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
