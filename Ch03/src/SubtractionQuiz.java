import java.util.Scanner;

public class SubtractionQuiz {
    public static void subtract(){
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print(num1 + "-" + num2 + "=");
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if(num1 - num2 ==result){
            System.out.print("The result is correct");
        }else
            System.out.print("The result is incorrect, right answer is " + (num1 - num2));
    }
}
