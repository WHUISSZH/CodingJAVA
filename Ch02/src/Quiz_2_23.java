import java.util.Scanner;

public class Quiz_2_23 {
    public static void computeCost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance (mile):");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double milesOfGallon = input.nextDouble();
        System.out.print("Enter price of per gallon（$）：");
        double priceOfGallon = input.nextDouble();

        double cost = (int)(distance / milesOfGallon * priceOfGallon * 1000) / 1000.0;
        System.out.print("The cost of driving is $" + cost);
    }
}
