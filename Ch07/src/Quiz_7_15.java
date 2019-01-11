import java.util.Arrays;
import java.util.Scanner;

class Quiz_7_15 {
    void printDistinctNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of number: ");
        int n = input.nextInt();

        int[] array = InputInteger.getArray(n);

        System.out.printf("The distinct numbers are %s", Arrays.toString(eliminate(array)));

    }

    private static int[] eliminate(int[] list){
        int sameNumCount = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j++){
                if(list[i] == list[j] && list[j] >= 0){
                    list[j] = -(j + 1);
                    sameNumCount++;
                }
            }
        }

        int[] distinctNumArray = new int[list.length - sameNumCount];
        for (int i = 0, j = 0; i < list.length; i++){
            if (list[i] >= 0){
                distinctNumArray[j] = list[i];
                j++;
            }
        }

        return distinctNumArray;
    }
}
