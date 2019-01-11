/**
 * @author callmezh
 * 继承基础图形类，再自定义三角形
 */
public class Quiz11_1_Triangle extends SimpleGeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**
     * 默认构造函数
     * 构造函数不能被子类继承，只能通过super关键字调用
     * 父类的构造方法被重写，此时如果子类的super关键字调用父类无参构造方法，就会编译报错
     */
    Quiz11_1_Triangle(){

    }

    /**
     * 有参构造方法
     * @param side1 边长
     * @param side2 变长
     * @param side3 边长
     */
    Quiz11_1_Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * 访问器方法
     * @return 边长
     */
    double getSide1(){
        return side1;
    }

    double getSide2(){
        return side2;
    }

    double getSide3(){
        return side3;
    }

    double getArea(){
        double circumference = (side1 + side2 + side3) / 2;
        return Math.sqrt(circumference * (circumference - side3) * (circumference - side2) * (circumference - side1));
    }

    double getPerimeter(){
        return side1 + side2 + side3;
    }

    /**
     * 重写方法
     * @return 对三角形描述
     */
    @Override
    public String toString(){
        return "Triangle : side1 " + side1 + " side2 " + side2 + " side3 " + side3;
    }
}
