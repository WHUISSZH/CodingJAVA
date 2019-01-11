import java.util.Scanner;

public class Quiz_6_5 {
    void displaySortedNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();
        sort(num1, num2, num3);
    }

    void sort(double num1, double num2, double num3){
        if (num1 >= num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 >= num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 >= num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.printf("The sort result is %.2f, %.2f, %.2f", num1, num2, num3);
    }
}
