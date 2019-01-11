import java.util.Scanner;

public class Quiz_4_12 {
    public void showBinary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String str = input.nextLine();

        if (str.length() != 1){
            System.out.print("You must enter exactly one character!");
            System.exit(1);
        }

        char ch = str.charAt(0);
        int value = 0;
        if (ch >= 'A' && ch <= 'F'){
             value = (int)(ch) - 55;
        }else if (Character.isDigit(ch) && (ch >= '0' && ch <= '9')){
            value = (int)ch - 48;
        }else {
            System.out.print(str + " is a invalid input!");
            System.exit(1);
        }

//        int[] result = new int[4];
//        int i = 0;
//        while (value != 0){
//            result[i] = value % 2;
//            i++;
//            value /= 2;
//        }
//        System.out.print("The binary value is ");
//        i--;
//        for (;i >= 0; i--){
//            System.out.print(result[i]);
//        }

        System.out.print("The binary value is ");
        if (value == 0){
            System.out.print(value);
        }else
            compute(value);
    }

    public void compute(int n){
        if (n == 0){
            return;
        }else
            compute(n /2);
        System.out.print(n % 2);
    }
}
