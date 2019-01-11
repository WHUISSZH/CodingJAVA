import java.util.Scanner;

public class Quiz_3_18 {
    public static void computeCost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the weight of package: ");
        double weight = input.nextDouble();
        if (weight > 0 && weight <= 1){
            System.out.print("The cost is 3.5$");
        }else if (weight <= 3){
            System.out.print("The cost is 5.5$");
        }else if (weight <= 10){
            System.out.print("The cost is 8.5$");
        }else if (weight <= 20){
            System.out.print("The cost is 10.5$");
        }else
            System.out.print("The package overweight and cannot be shipped!");
    }
}
