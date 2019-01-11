import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    void printGreatestcommonDivisor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("The greatest common divisor for %d, %d is %d", num1, num2, gcd(num1, num2));
    }

    //这里静态用不用都一样？gcd在同一个类中被另一个方法调用时，没有差别。
    //在类外调用时，这里是否是static就会对其调用方式有影响
    int gcd(int num1, int num2){
        int gcd = 1;
        int k = 2;

        while (k <= num1 && k <= num2){
            if (num1 % k == 0 && num2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
