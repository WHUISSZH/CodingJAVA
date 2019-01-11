import java.util.Scanner;

/**
 * @author callmezh
 *
 * 求矩阵各列的和
 *
 */
public class Quiz_8_1 {
    void printResult(){
        int [][] array = Array.createArray(4);
        Array.printArray(array);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the column index between 0 - 2 : ");
        int columnIndex = input.nextInt();
        System.out.printf("The sum of %d column is %d", columnIndex, sumColumn(array, columnIndex));
    }

    /**
     * @param array 二维数组
     * @param columnIndex 求和目标列
     * @retuen 目标列的和
     */
    static int sumColumn(int [][] array, int columnIndex){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            sum += array[row][columnIndex];
        }
        return sum;
    }
}
