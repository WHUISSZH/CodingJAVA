import java.util.Scanner;

public class HexDigit2Dec {
    public void hexDigit2Dec(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();

//        char hexDigitCh = Character.toUpperCase(hexDigit.charAt(0));
//        if (hexDigit.length() == 1){
//            if(Character.isDigit(hexDigitCh)){
//                System.out.println("The decimal value for hex digit " + hexDigit + " is " + hexDigitCh);
//            }else if (hexDigitCh >= 'A' && hexDigitCh <= 'F'){
//                System.out.println("The decimal value for hex digit " + hexDigit + " is " + (hexDigitCh - 'A' + 10));
//            }else
//                System.out.println( hexDigit + " is an invalid input!");
//        }else
//            System.out.println( hexDigit + " is an invalid input!");

        if (hexDigit.length() != 1){
            System.out.println("You must enter exactly one character!");
            System.exit(1);
        }

        char hexDigitCh = Character.toUpperCase(hexDigit.charAt(0));
        if(Character.isDigit(hexDigitCh)){
                System.out.println("The decimal value for hex digit " + hexDigit + " is " + hexDigitCh);
            }else if (hexDigitCh >= 'A' && hexDigitCh <= 'F'){
                System.out.println("The decimal value for hex digit " + hexDigit + " is " + (hexDigitCh - 'A' + 10));
            }else
                System.out.println( hexDigit + " is an invalid input!");
    }
}
