import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_12 {
    void printReverseResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of number: ");
        int n = input.nextInt();

        int[] array = InputInteger.getArray(n);


        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(reverseArray(array)));
    }

    static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
