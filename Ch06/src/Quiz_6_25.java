import java.util.Scanner;

public class Quiz_6_25 {
    void printTime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the millis: ");
        long millis = input.nextLong();

        System.out.printf("The time is %s", convertMillis(millis));
    }

    static String convertMillis(long millis){

        long totalSecond = millis / 1000;
        long second = totalSecond % 60;

        long totalMin = totalSecond / 60;
        long min = totalMin % 60;

        long totalHour = totalMin / 60;
        long hour = totalHour;

        return "" + hour + ":" + min + ":" + second;
    }
}