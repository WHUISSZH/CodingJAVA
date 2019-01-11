/**
 * @author callmezh
 * 求 N X N 矩阵主对角线元素的和
 */
public class Quiz_8_2 {
    void printResult(){
        int [][] array = Array.createArray(4);
        Array.printArray(array);
        System.out.printf("The sum of major diagonal is %d", sumMajorDiagonal(array));
    }

    /**
     * @param array 二维数组
     * @return sum 对角元素和
     */
    private static int sumMajorDiagonal(int[][] array){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            sum += array[row][row];
        }
        return sum;
    }
}
