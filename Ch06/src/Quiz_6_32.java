import java.util.Scanner;

public class Quiz_6_32 {
    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the times: ");
        int n = input.nextInt();
        int countWin = 0;
        for (int i = 1; i <= n; i++){
            if (Quiz_6_30.printCrapsResult()){
                countWin++;
            }
        }

        System.out.printf("Win times are %d, lose times are %d", countWin, n - countWin);
    }
}
