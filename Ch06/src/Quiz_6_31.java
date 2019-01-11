import java.util.Scanner;

/*
    验证信用卡合法性
 */
public class Quiz_6_31 {
    void printIsCard(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit number as a string: ");
        String creditNumStr = input.next();

        if (!validLengthAndCharType(creditNumStr)){
            System.out.print("Enter the right length credit card!");
            System.exit(0);
        }

        if (isValid(creditNumStr)){
            System.out.printf("%s is valid!", creditNumStr);
        }else
            System.out.printf("%s is invalid!", creditNumStr);
    }

    //return true if the card number is valid
    static boolean isValid(String num){
        boolean isValid = true;
        int sum = 0;
        int sumOddPlace = 0;

        for (int i = 0; i <= num.length() - 1; i++){
            if ((i + 1) % 2 == 1){
                sum += getDigits(num.charAt(i));
                sumOddPlace += (num.charAt(i) - '0');
            }
        }

        if ((sum + sumOddPlace) % 10 != 0){
            isValid = false;
        }

        return isValid;
    }

    //return true if the number length between 13 to 16
    //return true if the string char is number
    static boolean validLengthAndCharType(String numStr){
        if (numStr.length() >= 13 && numStr.length() <= 16){
            return true;
        }else
            return false;
    }

    //Return this number if it is a single number
    //return the sum of the two digits
    static int getDigits(char numChar){
        int num = 2 * (numChar - '0');
            if (num <= 9){
                return num;
            }else
                return num % 10 + 1;
    }

}
