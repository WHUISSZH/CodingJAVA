import java.util.Scanner;

public class Quiz_4_11 {
    public void showHex(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        byte dec = input.nextByte();

        if (dec >=0 && dec <= 9){
            System.out.print("The hex value is " + dec);
        }else if (dec >=10 && dec <= 15){
            char ch = (char)(55 + dec);
            System.out.print("The hex value is " + ch);
        }else
            System.out.print( dec + " is an invalid input!");
    }
}
