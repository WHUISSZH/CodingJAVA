import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_11_9_MaxNum {
    static void printResult(){
        System.out.print("Enter the array size n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() + 0.5);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.print("The largest row index: ");
        for (int i = 0; i < getIndex(array).size(); i++){
            System.out.print(getIndex(array).get(i) + ", ");
        }
    }

    private static ArrayList<Integer> getIndex(int [][] array){
        ArrayList<Integer> maxRowIndex = new ArrayList<>();
        int sumOfRow = sumOfRow(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (sumOfRow < sumOfRow(array[i])) {
                sumOfRow = sumOfRow(array[i]);
                maxRowIndex.clear();
                maxRowIndex.add(i);
            }else if (sumOfRow == sumOfRow(array[i])){
                maxRowIndex.add(i);
            }
        }
        return maxRowIndex;
    }

   private static int sumOfRow(int [] array){
        int sumOfRow = 0;
        for (int i = 0; i < array.length; i++){
            sumOfRow += array[i];
        }
        return sumOfRow;
    }
}