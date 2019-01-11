import java.util.Scanner;

public class AnalyzeNum {
    void printAnalyzeResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        double [] nums = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++){
            nums[i]  = input.nextDouble();
            sum += nums[i];
        }

        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] > average){
                count++;
            }
        }

        System.out.printf("Average is %f\n", average);
        System.out.printf("Number of elements above the average is %d", count);
    }

}
