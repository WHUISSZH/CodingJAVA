import java.util.Scanner;

public class Quiz_3_12 {
    public static void computeNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer :");
        int oldNum = input.nextInt();

        int num = oldNum;
        int h = num / 100;
        num %= 100;
        int t = num / 10;
        num %= 10;
        int s = num;

        int newNum = s * 100 + t * 10 + h * 1;
        if (newNum == oldNum){
            System.out.print( newNum + " is a palindrome");
        }else
            System.out.print( newNum + " is not a palindrome");

    }
}
