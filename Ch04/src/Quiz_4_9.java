import java.util.Scanner;

public class Quiz_4_9 {
    public void showUnicode(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String str = input.nextLine();

        if (str.length() != 1){
            System.out.print("You must enter exactly one character1");
            System.exit(1);
        }

        char ch = str.charAt(0);
        int unicode = ch;
        System.out.printf("The Unicode for the character %c is %d", ch, unicode);
    }
}
