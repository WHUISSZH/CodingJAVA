import java.util.Scanner;

public class Quiz_3_33 {
    public static void compareCost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for the package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for the package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / weight1 == price2 / weight2){
            System.out.print("Two package is the same!");
        }else if (price1 / weight1 > price2 / weight2){
            System.out.print("Package 2 has a better price");
        }else if (price1 / weight1 < price2 / weight2){
            System.out.print("Package 1 has a better price");
        }
    }
}
