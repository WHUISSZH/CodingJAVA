import java.util.Scanner;

public class Quiz_4_14 {
    public void trans(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterStr = input.nextLine();

        if (letterStr.length() != 1){
            System.out.print("You must enter exactly one letter!");
            System.exit(1);
        }

        char letter = letterStr.charAt(0);
        switch (letter){
            case 'A':
                System.out.printf("The numeric value for grade %c is 4", letter);
                break;
            case 'B':
                System.out.printf("The numeric value for grade %c is 3", letter);
                break;
            case 'C':
                System.out.printf("The numeric value for grade %c is 2", letter);
                break;
            case 'D':
                System.out.printf("The numeric value for grade %c is 1", letter);
                break;
            case 'F':
                System.out.printf("The numeric value for grade %c is 0", letter);
                break;
            default:
                    System.out.print("You must enter the letter: A , B, C, D, F");
        }
    }
}
