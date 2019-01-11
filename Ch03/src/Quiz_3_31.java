import java.util.Scanner;

public class Quiz_3_31 {
    public static void exchangeMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollarsToRMB = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice verse: ");
        int index = input.nextInt();

        switch (index){
            case 0:
                System.out.print("Enter the dollar amount: ");
                double amountOfDollars = input.nextDouble();
                System.out.print( "$" + amountOfDollars + " is ￥" + (int)(dollarsToRMB * amountOfDollars * 100) / 100.0);
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                double amountOfRMB = input.nextDouble();
                System.out.print( "Y" + amountOfRMB + " is $" + (int)(amountOfRMB / dollarsToRMB * 100) / 100.0);
                break;
                default:
                System.out.print("Incorrect input!");
        }
    }
}
