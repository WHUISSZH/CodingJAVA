import java.util.Scanner;

public class Quiz_7_9 {
    void printMinNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integer: ");
        int[] array = new int[5];

        for (int i = 0; i < 5; i++){
            array[i] = input.nextInt();
        }

        System.out.printf("The min number is %d", min(array));

    }

    static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
