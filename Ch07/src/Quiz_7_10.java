import java.util.Scanner;

public class Quiz_7_10 {
    void printMinNumIndex(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of number: ");
        int n = input.nextInt();

        int[] array = InputInteger.getArray(n);

        System.out.printf("The smallest number's index is %d", min(array));
    }

    static int min(int[] array){
        int min = array[0];
        int minNumIndex = 1;
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                minNumIndex = i + 1;
            }
        }
        return minNumIndex;
    }
}
