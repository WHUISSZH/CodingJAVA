/**
 * @author callmezh
 * 定义rectangle类
 */
public class Quiz_9_1_Rectangle {
    private double width = 1;
    private double height = 1;

    /**
     * 默认构造类，不写的话就只能使用下面那个构造方法了
     */
    public Quiz_9_1_Rectangle(){

    }

    /**
     * 重写构造函数
     * @param width 用户自定义宽度
     * @param height 用户自定义高度
     */
    Quiz_9_1_Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * 返回矩形面积
     * @return
     */
    double getArea(){
        return width * height;
    }

    /**
     * 返回矩形周长
     * @return
     */
    public double getPerimeter(){
        return 2 * (width + height);
    }

}
