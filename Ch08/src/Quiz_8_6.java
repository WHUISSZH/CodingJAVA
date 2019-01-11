/**
 * 矩阵乘法
 * @author callmezh
 */
public class Quiz_8_6 {
    void printResult(){
        int [][] arrayA = Array.createArray(2);
        int [][] arrayB = Array.createArray(2);
        Array.printArray(arrayA);
        Array.printArray(arrayB);
        int [][] result = new int[2][2];

        for (int i = 0; i < arrayA.length; i++){
            for (int j = 0; j < arrayA[i].length; j++){
                for (int k = 0; k < result[0].length; k++){
                    result[i][j] += arrayA[i][k] * arrayB[k][j];
                }
            }
        }
        Array.printArray(result);
    }
}