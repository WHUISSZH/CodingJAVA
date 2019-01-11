import java.util.Scanner;

public class Quiz_3_21 {
    public static void computeDay(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2018) : ");
        int year = input.nextInt();
        System.out.print("Enter month 1-12 : ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month 1-31 : ");
        int day = input.nextInt();

        if (month == 1 || month == 2){
            month += 12;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;

        int h = ( day +
                26 * (month + 1) / 10
                + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h){
            case 0:
                System.out.print("Day of the week is Saturday");
                break;
            case 1:
                System.out.print("Day of the week is Sunday");
                break;
            case 2:
                System.out.print("Day of the week is Monday");
                break;
            case 3:
                System.out.print("Day of the week is Tuesday");
                break;
            case 4:
                System.out.print("Day of the week is Wednesday");
                break;
            case 5:
                System.out.print("Day of the week is Thursday");
                break;
            case 6:
                System.out.print("Day of the week is Friday");
        }
    }
}
