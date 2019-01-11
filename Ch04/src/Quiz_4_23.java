import java.util.Scanner;

public class Quiz_4_23 {
    public void computePay(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double staTaxRate = input.nextDouble();

        System.out.printf("\nEmployee name: %s\n", name);
        System.out.printf("Hours worked: %1.1f\n", hours);
        System.out.printf("Pay Rate: $%1.2f\n", payRate);
        System.out.printf("Gross Pay: $%1.2f\n", payRate * hours);
        System.out.println("Deduction:");
        System.out.printf("   Federal Withholding (%1.2f%%): $%1.2f\n", fedTaxRate * 100, payRate * hours * fedTaxRate);
        System.out.printf("   State Withholding (%1.2f%%): $%1.2f\n", staTaxRate * 100, payRate * hours * staTaxRate);
        System.out.printf("   Total Deduction: $%1.2f\n", payRate * hours * (fedTaxRate + staTaxRate));
        System.out.printf("Net Pay: %1.2f", payRate * hours - payRate * hours * (fedTaxRate + staTaxRate));
    }
}
