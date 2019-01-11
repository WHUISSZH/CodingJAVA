import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_32 {
    void printSortArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++){
            System.out.printf("Enter the %dth number: ", i + 1);
            array[i] = input.nextInt();
        }

        System.out.printf("The index is %d, list is %S", part(array), Arrays.toString(array));
    }

    static int part(int[] array){
        int i;
        for(i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }else{
                break;
            }
        }
        return i;
    }
}