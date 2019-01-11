import java.util.Scanner;

public class Quiz_3_5 {
    public static void showDate(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int numOfdate = input.nextInt();
        String date = null;
        switch (numOfdate){
            case 0:
                date = "Sunday";
                break;
            case 1:
                date = "Monday";
                break;
            case 2:
                date = "Tuesday";
                break;
            case 3:
                date = "Wednesday";
                break;
            case 4:
                date = "Thursday";
                break;
            case 5:
                date = "Friday";
                break;
            case 6:
                date = "Staurday";
        }
        System.out.print("Enter the number of days elapsed since today: ");
        int numOfDays = input.nextInt();
        System.out.print("Today is " + date + " and the future day is ");
        switch ((numOfDays + numOfdate) % 7){
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
        }
    }
}
