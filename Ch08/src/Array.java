import java.util.Scanner;

/**
 * @author callmezh
 * @version 1.0.0
 */
class Array {
    /**
     * 用户自定义二维数组长度，创建数组
     * @return array 生产的二维数组
     */
    static int[][] createArray(int size){
        int[][] array = new int[size][size];
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter " + array.length + " rows " + array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                //array[row][column] = input.nextInt();
                //使用随机值赋值数组
                array[row][column] = (int)(Math.rint(Math.random()));
            }
        }
        return array;
    }

    /**
     * 对二维数组所有元素求和
     */
    static int sumArray(int[][] array){
        int sum = 0;
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                sum += anAnArray;
            }
        }
        return sum;
    }

    /**
     * 对二维数组按行求和
     * @param array 二维数组
     * @return 存储每行元素和的一维数组
     */
    static int [] sumOfRow(int [][] array){
        int [] sumOfRow = new int[array.length];
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                sumOfRow[row] += array[row][column];
            }
        }
        return sumOfRow;
    }

    /**
     * 使用for循环打印二维数组， 实现了数组的翻转
     * @param array 二维数组
     */
    static void printOverArray(int[][] array){
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = array[i].length - 1; j >= 0; j--){
                if (j == 0){
                    System.out.printf("%d  \n", array[i][j]);
                }else {
                    System.out.printf("%d  ", array[i][j]);
                }
            }
        }
    }

    /**
     * 使用for循环正常打印int型数组
     */
    static void printArray(int[][] array){
        for (int[] anArray : array) {
            for (int j = 0; j < anArray.length; j++) {
                if (j == anArray.length - 1) {
                    System.out.printf("%d  \n", anArray[j]);
                } else {
                    System.out.printf("%d  ", anArray[j]);
                }
            }
        }
    }

    /**
     * 使用for循环正常打印char型数组
     */
    static void printArray(char[][] array){
        for (char[] anArray : array) {
            for (int j = 0; j < anArray.length; j++) {
                if (j == anArray.length - 1) {
                    System.out.printf("%c  \n", anArray[j]);
                } else {
                    System.out.printf("%c  ", anArray[j]);
                }
            }
        }
    }
}