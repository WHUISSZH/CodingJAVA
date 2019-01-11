import java.util.Scanner;

public class Quiz_4_18 {
    public void showStudentInfo(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter two characters: ");
        String infoStr = input.nextLine();

        if (infoStr.length() != 2){
            System.out.printf("%s is an invalid input!", infoStr);
            System.exit(1);
        }

        char majorCh = infoStr.charAt(0);
        char gradeCh = infoStr.charAt(1);
        String major, grade;
        switch (majorCh){
            case 'M':
                major = "Math";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Science";
                break;
                default:
                    major = "Invalid input";
        }

        switch (gradeCh){
            case '1':
                grade = "Frenchman";
                break;
            case '2':
                grade = "Second";
                break;
            case '3':
                grade = "Junior";
                break;
            case '4':
                grade = "Old";
                break;
                default:
                    grade = "Invalid input";
        }

        if (major.equals(grade)){
            System.out.printf("Invalid input!");
            System.exit(1);
        }

        System.out.printf("%s %s", major, grade);
    }
}
