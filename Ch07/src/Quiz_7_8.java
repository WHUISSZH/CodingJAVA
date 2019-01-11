import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Quiz_7_8 {
    void printAverage(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 double number: ");
        int[] array = new int[3];

        for (int i = 0; i < 3; i++){
            array[i] = input.nextInt();
        }

        System.out.printf("%.2f", average(array));
    }

    static int average(int[] array){
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum / array.length;
    }

    static double average(double[] array){
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum / array.length;
    }
}
