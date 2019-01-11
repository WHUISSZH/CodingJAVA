import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Quiz_9_1_Rectangle rectangle1 = new Quiz_9_1_Rectangle(4, 40);
//        Quiz_9_1_Rectangle rectangle2 = new Quiz_9_1_Rectangle(3.5, 35.9);
//        System.out.print("rectangle1: " + rectangle1.getArea());
//        System.out.print("rectangle2: " + rectangle2.getArea());

//        Quiz_9_2_Stock stock = new Quiz_9_2_Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
//        System.out.printf("The change percent is %s", stock.getChangePercent());

//        Quiz_9_3_Date date = new Quiz_9_3_Date();
//        date.printDate();

//        Quiz_9_4_Random random = new Quiz_9_4_Random();
//        random.printRandom();

//        int lengthOfArray = 100000;
//        int [] array = new int[lengthOfArray];
//        Random myRandom = new Random();
//        for (int i = 0; i < array.length; i++){
//            array[i] = myRandom.nextInt(1000000);
//        }
//
//        Quiz_9_6_StopWatch stopWatch = new Quiz_9_6_StopWatch();
//        stopWatch.startTime();
//        System.out.printf("start time: %d\n", stopWatch.getStartTime());
//        Arrays.sort(array);
//        stopWatch.endTime();
//        System.out.printf("end time: %d", stopWatch.getEndTime());
//        System.out.printf("\ncost time: %d", stopWatch.getElapsedTime());

        int row = 3;
        int column = 3;
        double [][] array = new double[row][column];
        System.out.print("Enter the array: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                array[i][j] = input.nextDouble();
            }
        }
        Quiz_9_13_Location location = Quiz_9_13_Location.locationLargest(array);
        System.out.printf("The max value is %.2f, location is (%d, %d)",
                location.getMaxValue(), location.getRow(), location.getColumn());
    }
}
