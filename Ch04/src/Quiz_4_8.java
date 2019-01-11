import java.util.Scanner;

public class Quiz_4_8 {
    public void showASCII(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        byte code = input.nextByte();
        if (code >=0 && code <= 127){
            char ch = (char)code;
            System.out.printf("The character for ASCII code %d is %c", code, ch);
        }else
            System.out.print("Please enter a ASCII code between 0 to 127!");
    }
}
