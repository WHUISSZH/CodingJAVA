import java.util.Scanner;

public class Quiz_4_17 {
    public void showDays(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        //nextXXXX之后不可以使用nextLine
        String month = input.next();

        int days = 31;
        switch (month){
            case "Jan":
            case "May":
            case "March":
            case "July":
            case "Aug":
            case "Oco":
            case "Dec":
                break;
            case "Feb":
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days = 29;
                }else
                    days = 28;
                break;
            case "Api":
            case "June":
            case "Spe":
            case "Nov":
                days = 30;
                break;
            default:
                    System.out.printf("%s is an invalid input!", month);
                    System.exit(1);
        }

        System.out.printf("%s %d has %d days", month, year, days);
    }
}
