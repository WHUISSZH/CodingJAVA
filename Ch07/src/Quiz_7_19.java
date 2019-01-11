import java.util.Scanner;

public class Quiz_7_19 {
    void printListResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = input.nextInt();
        int[] numArray = new int[n];

        for (int i = 0; i < n; i++){
            numArray[i] = input.nextInt();
        }

        if (isSorted(numArray)){
            System.out.print("The list has sorted");
        }else
            System.out.print("The list has not sorted");
    }

    static boolean isSorted(int[] list){
        boolean isSorted = true;

        for (int i = 0; i < list.length - 1; i++){
            if (list[i] > list[i + 1]){
                isSorted = false;
                break;
            }
        }

        //还可以比较字符串是否一样
        return isSorted;
    }


}
