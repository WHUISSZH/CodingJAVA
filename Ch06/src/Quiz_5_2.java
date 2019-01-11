import java.util.Scanner;

public class Quiz_5_2 {
    void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.printf("The sum is %d", sumDigits(num));
    }

    private static int sumDigits(int n){
        int sum = 0;
        int temp = n;
        while (temp != 0){
            int remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }
        return sum;
    }
}
