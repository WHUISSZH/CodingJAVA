import java.util.Scanner;

public class Quiz_4_21 {
    public void checkSSN(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String SSN_Str = input.next();

        if (SSN_Str.length() != 11){
            System.out.printf("%s is an invalid social security number!", SSN_Str);
            //System.out.println(SSN_Str.length());
            System.exit(1);
        }

        for (int i = 0; i <= 2; i++){
            if (!Character.isDigit(SSN_Str.charAt(i))){
                System.out.printf("%s is an invalid social security number!", SSN_Str);
                System.exit(1);
            }
        }

        if (SSN_Str.charAt(3) != '-'){
                System.out.printf("%s is an invalid social security number!", SSN_Str);
                System.exit(1);
        }

        for (int i = 4; i <=5; i++){
            if (!Character.isDigit(SSN_Str.charAt(i))){
                System.out.printf("%s is an invalid social security number!", SSN_Str);
                System.exit(1);
            }
        }

        if (SSN_Str.charAt(6) != '-'){
            System.out.printf("%s is an invalid social security number!", SSN_Str);
            System.exit(1);
        }

        for (int i = 7; i <= 10; i++){
            if (!Character.isDigit(SSN_Str.charAt(i))){
                System.out.printf("%s is an invalid social security number!", SSN_Str);
                System.exit(1);
            }
        }

        System.out.printf("%s is a valid social security number!", SSN_Str);
    }
}
