import java.util.Scanner;

public class Quiz_4_13 {
    public void isVowel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letterStr = input.nextLine();

        if (letterStr.length() != 1){
            System.out.print("You must enter exactly a letter!");
            System.exit(1);
        }

        char letter = letterStr.charAt(0);
        if (letter >= 'A' && letter <= 'z'){
            switch (letter){
                case 'a':
                case 'A':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.printf("%c is a vowel", letter);
                    break;
                default:
                    System.out.printf("%c is a consonant", letter);
            }
        }else
            System.out.printf("%c is an invalid input!", letter);
    }
}
