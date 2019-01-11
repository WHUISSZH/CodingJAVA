import java.util.Scanner;

/**
 * @author callmezh
 * 打印十进制数对应的三维矩阵
 */
public class Quiz_8_11 {
    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = input.nextInt();
        Array.printArray(turnNUmToMatrix(num));
    }

    /**
     * 将十进制数转变为矩阵
     * @param num 用户输入的十进制数
     * @return 对应的矩阵三维数组
     */
    private static char[][] turnNUmToMatrix(int num){
        String binaryNum = Integer.toBinaryString(num);
        final int rowOfMatrix = 3;
        final int columnOfMatrix = 3;
        char [][] matrix = new char[rowOfMatrix][columnOfMatrix];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[columnOfMatrix - 1].length; j++){
                matrix[i][j] = 'H';
            }
        }

        int count = binaryNum.length() - 1;
            for (int row = matrix.length - 1; row >= 0; row--){
                for (int column = matrix[row].length - 1; column >= 0; column--){
                    if (binaryNum.charAt(count) == '1'){
                        matrix[row][column] = 'T';
                    }
                    count--;
                    if (count < 0){
                        return matrix;
                }
            }
        }
        return matrix;
    }
}
