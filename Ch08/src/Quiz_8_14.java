import java.util.Scanner;

/**
 * @author callmezh
 * 检查矩阵行列是否一样
 */
public class Quiz_8_14 {
    void printCheckResult(){
        System.out.print("Enter the size of matrix: ");
        Scanner input = new Scanner(System.in);
        int sizeOfMatrix = input.nextInt();
        int [][] matrix = Array.createArray(sizeOfMatrix);
        Array.printArray(matrix);
        printRowCheckResult(matrix);
        printColumnCheckResult(matrix);
        printMajorDiagonalResult(matrix);
        printSubDiagonalResult(matrix);
    }

    /**
     * 检查行元素是否一样
     * @param matrix 数组矩阵
     */
    private static void printRowCheckResult(int[][] matrix){
        boolean [] isSame = new boolean[matrix.length];
        boolean isSameOnRow = false;
        for (int i = 0; i < isSame.length; i++){
            isSame[i] = true;
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length - 1; j++){
                if (matrix[i][j] != matrix[i][j + 1]){
                    isSame[i] = false;
                    break;
                }
            }
            if (isSame[i]){
                System.out.printf("All %ds on row %d\n", matrix[i][0], i);
                isSameOnRow = true;
            }
        }
        if (!isSameOnRow){
            System.out.print("No same numbers on a row\n");
        }
    }

    /**
     * 检查列元素是否一样
     * @param matrix 矩阵数组
     */
    private static void printColumnCheckResult(int[][] matrix){
        boolean [] isSame = new boolean[matrix.length];
        boolean isSameOnRow = false;
        for (int i = 0; i < isSame.length; i++){
            isSame[i] = true;
        }

        for (int i = 0; i < matrix.length - 1; i++){
            int column = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != matrix[i + 1][j]){
                    isSame[column] = false;
                    break;
                }
                column++;
            }
            if (isSame[column]){
                System.out.printf("All %ds on column %d\n", matrix[0][0], column);
                isSameOnRow = true;
            }
        }
        if (!isSameOnRow){
            System.out.print("No same numbers on a column\n");
        }

    }

    /**
     * 检查主对角线是否一样
     * @param matrix 数组矩阵
     */
    private static void printMajorDiagonalResult(int[][] matrix){
        boolean isSame = true;
        boolean isSameOnRow = false;

        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][i] != matrix[i + 1][i + 1]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.printf("All %ds on major diagonal\n", matrix[0][0]);
            isSameOnRow = true;
        }
        if (!isSameOnRow){
            System.out.print("No same numbers on a major diagonal\n");
        }
    }

    /**
     * 检查反对角线元素是否一样
     * @param matrix 数组矩阵
     */
    private static void printSubDiagonalResult(int[][] matrix){
        boolean isSame = true;
        boolean isSameOnRow = false;

        for (int i = matrix.length - 1; i > 0; i--) {
            if (matrix[i][i] != matrix[i - 1][i - 1]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.printf("All %ds on sub-diagonal\n", matrix[matrix.length - 1][0]);
            isSameOnRow = true;
        }
        if (!isSameOnRow){
            System.out.print("No same numbers on a sub-diagonal\n");
        }
    }
}
