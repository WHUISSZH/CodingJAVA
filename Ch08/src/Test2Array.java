import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Test2Array {
    void printResult(){
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(matrix[0]));
        //二维数组的长度是其包含一维数组的数量
        System.out.println(matrix.length);
        //二维数组的元素是一维数组， 意味着其还可以使用数组的一般方法
        System.out.println(matrix[2].length);

        //打乱数组
        Array.printArray(matrix);
        Array.printArray(mixArray(matrix));
    }

    //锯齿数组  声明的技巧
    static void creatSerrateArray(){
        int [][] triangleArray = {
                {1, 2 , 3},
                {4, 5},
                {6}
        };

        //必须指定二维数组元素个数，但不必声明一维数组元素个数
        //即必须要有第一个下标
        int [][] triangleArray2 = new int[3][];

        //声明一维数组元素个数
        triangleArray2[0] = new int[3];
        triangleArray2[1] = new int[2];
        triangleArray2[2] = new int[1];

        //给每一个值赋值

        triangleArray2[0][0] = 1;
        triangleArray2[0][1] = 2;
    }

    void printOutput(){
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println(array[1][0]);
    }

    void inputCreateArray(){
        int[][] array = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows " + array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                //array[row][column] = input.nextInt();
                //使用随机值赋值数组
                array[row][column] = (int)(Math.random() * 10);
            }
        }
        //使用Arrays.toString方法打印二维数组元素，不能直接打印二维数组
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));



        //对数组按列求和
        for (int column = 0; column < array[0].length; column++){
            int total = 0;
            for (int row = 0; row < array.length; row++){
                total += array[row][column];
            }
            System.out.printf("The sum of %d column is %d\n", column, total);
        }

        //找出和最大的行
        int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int i = 0; i < array[0].length; i++){
            maxRow += array[0][i];
        }

        for (int row = 0; row < array.length; row++){
            int totalRow = 0;
            for (int column = 0; column < array[row].length; column++){
                totalRow += array[row][column];
            }
            if (maxRow < totalRow){
                maxRow = totalRow;
                indexOfMaxRow = row;
            }
        }
        System.out.printf("The %d row has the maximum sum of %d", indexOfMaxRow, maxRow);


    }


    int[][] mixArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int i1 = (int)(Math.random() * array.length);
                int j1 = (int)(Math.random() * array[i].length);

                int temp = array[i][j];
                array[i][j] = array[i1][j1];
                array[i1][j1] = temp;
            }
        }
        return array;
    }
}
