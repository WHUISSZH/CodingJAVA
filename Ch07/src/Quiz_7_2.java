
import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_2 {
    void rever(){
        Scanner input = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i ++){
            System.out.printf("Enter the %d number: ", i);
            num[i] = input.nextInt();
        }

        int[] reverNum = new int[4];
        for (int i = 3, j = 0; i >= 0 && j < 4; i--, j++){
            reverNum[j] = num[i];
        }

        System.out.println(Arrays.toString(num));
        System.out.print(Arrays.toString(reverNum));
    }
}
