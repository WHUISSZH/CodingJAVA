/**
 * @author callmezh
 * 自定义location类，通过get 与 set 方法获取其属性
 */
class Quiz_9_13_Location {
    private int row;
    private int column;
    private double maxValue;

    /**
     * 静态方法，不需要实例化location类
     * @param array 用户输入的二维数组
     * @return 返回目标类
     */
    static Quiz_9_13_Location locationLargest(double[][] array){
        Quiz_9_13_Location location = new Quiz_9_13_Location();
        location.maxValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (location.maxValue < array[i][j]){
                    location.maxValue = array[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        //返回一个Quiz_9_13_Location 类型对象
        return location;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    double getMaxValue() {
        return maxValue;
    }
}
