import java.util.Scanner;

public class AdditionQuiz {
    public static void addition(){
        double num1 = System.currentTimeMillis()  % 2;
        double num2 = System.currentTimeMillis()  % 7;
        System.out.print(num1 + "+" + num2 + " = ");
        Scanner input = new Scanner(System.in);
        double result = input.nextDouble();
        if(num1 + num2 == result){
            System.out.print ("The answer is correct");
        }else
            System.out.print ("The answer is incorrect");
    }
}
