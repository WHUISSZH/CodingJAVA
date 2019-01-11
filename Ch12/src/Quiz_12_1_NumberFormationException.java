import java.util.Scanner;

/**
 * @author callmezh
 * 简单计算器
 */
public class Quiz_12_1_NumberFormationException {
    int num1 = 0;
    int num2 = 0;
    int result = 0;
    String operator;
    void printResult(){
    String ifContinue;
            do {
                try {
                    System.out.print("Enter the number 1: ");
                    Scanner input = new Scanner(System.in);
                    num1 = input.nextInt();
                    System.out.print("Enter the operator: ");
                    operator = input.next();
                    System.out.print("Enter the number 2: ");
                    num2 = input.nextInt();
                }catch (Exception ex) {
                    System.out.println("Please the right number");
                    System.exit(2);
                }
                switch (operator){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                     default:
                         System.out.println("Please enter the primary operator");
                         System.exit(1);
                }
                System.out.println("The result is " + result);
                System.out.print("If you want to continue, enter y; else enter n: ");
                ifContinue = new Scanner(System.in).next();
            }while ("y".equals(ifContinue));
        }
}
