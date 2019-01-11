import java.util.Scanner;

public class Quiz_6_21 {
    void printPhoneNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("phone number is ");
        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.printf("%c", transLetterToNum(str.toUpperCase().charAt(i)));
            }else
                System.out.printf("%c", str.charAt(i));
        }

    }

    private static char transLetterToNum(char strLetterChar){
            switch (strLetterChar) {
                case 'A':
                case 'B':
                case 'C':
                    return '2';
                case 'D':
                case 'E':
                case 'F':
                    return '3';
                case 'G':
                case 'H':
                case 'I':
                    return '4';
                case 'J':
                case 'K':
                case 'L':
                    return '5';
                case 'M':
                case 'N':
                case 'O':
                    return '6';
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    return '7';
                case 'T':
                case 'U':
                case 'V':
                    return '8';
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    return '9';
                default:
                    return ' ';
            }
        }
}