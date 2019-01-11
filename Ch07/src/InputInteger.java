import java.util.Scanner;

public class InputInteger {
    static int[] getArray(int num){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter %d integer: ", num);
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        return array;
    }
}
