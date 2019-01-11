public class CircleWithCustomException {
    private double radius;
    /**
     * 静态变量，类的所有实例共用一个变量
     */
    private static int numOfObject = 0;

    /**
     * 无参构造方法
     * @throws InvalidRadiusException 输入非法半径异常
     */
    CircleWithCustomException() throws InvalidRadiusException{
        radius = 1.0;
    }

    /**
     * 有参构造方法
     * @param newRadius 新半径
     * @throws InvalidRadiusException 输入非法半径异常
     */
    CircleWithCustomException(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numOfObject++;
    }

    /**
     * 设置新半径
     * @param newRadius 半径
     * @throws InvalidRadiusException 非法半径
     */
    private void setRadius(double newRadius) throws InvalidRadiusException{
        if (newRadius >= 0){
            radius = newRadius;
        }else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    /**
     * 访问器，返回创建成功的对象数量
     * @return 创建成功的对象数量
     */
    static int getNumOfObject(){
        return numOfObject;
    }
}
