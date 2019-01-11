import java.util.Scanner;

public class Quiz_6_18 {
    void checkPassword(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = input.nextLine();

        //无法判断出错原因
        if (isValidPassword(password)){
            System.out.print("valid password!");
        }else
            System.out.print("invalid password!");
    }

    static boolean isValidPassword(String password){
        boolean isValidPassword = true;
        int isDigitCount = 0;

        if (password.length() < 8){
            return false;
        }

        for(int i = password.length() - 1; i >= 0; i--){
            if (!(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)))){
                return false;
            }

            if (Character.isDigit(password.charAt(i))){
                isDigitCount++;
            }
        }

        if (isDigitCount < 2 ){
            isValidPassword = false;
        }

            return isValidPassword;
    }
}
