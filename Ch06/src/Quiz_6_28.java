import java.util.Scanner;

public class Quiz_6_28 {
    void printMSPrimeNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("P     2^P - 1\n");
        int i = 2;
        //大于等于2，因为这样可以直接排除1的可能性
        while (i <= num){
            if (PrimeNumMethod.isPrimeNum(i) && Math.sqrt(i + 1) % 1 == 0){
                    System.out.printf("%.0f    %4d\n", Math.sqrt(i + 1), i);
            }
            i++;
        }
    }
}
