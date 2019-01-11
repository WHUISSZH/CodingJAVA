import java.util.Scanner;

public class Quiz_4_20 {
    public void showLetters(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = input.nextLine();

        System.out.printf("%s's length is %d, its first letter is %c", str, str.length(), str.charAt(0));
    }
}
