import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_28 {
    void printCombinationResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();
        int[] numArray = new int[length];

        for (int i = 0; i < numArray.length; i++){
            numArray[i] = input.nextInt();
        }

        int lengthOfResult = 0;
        int[] combination = new int[length * (length - 1)];
        for (int i = 0; i < numArray.length; i++){
            for (int j = 0;  j < numArray.length; j++){
                if (j == i){
                    continue;
                }
                combination[lengthOfResult] = numArray[i] * 10 + numArray[j];
                lengthOfResult++;
            }
        }

        System.out.printf("The result is %s", Arrays.toString(combination));
    }
}
