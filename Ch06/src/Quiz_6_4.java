import java.util.Scanner;

class Quiz_6_4 {
    void showPalindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = input.nextLine();
        System.out.printf("it's palindrome is %s", Quiz_5_3.reverse(num));
    }
}
