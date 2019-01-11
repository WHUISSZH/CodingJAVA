import java.util.Scanner;

public class Quiz_6_7 {
    void printInvestmentValue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount($): ");
        double investment = input.nextDouble();
        System.out.print("Enter the monthly rate(%): ");
        double yearRate = input.nextDouble();

        System.out.print("Years    Future Value\n");
        futureInvestmentValue(investment, yearRate);
    }

    static void futureInvestmentValue(double investment, double yearRate){
        double futureInvestmentValue = investment;
        for (int years = 1; years <= 30; years++){
            futureInvestmentValue *= (1 + yearRate / 100);
            System.out.printf("%3d        %.3f\n", years, futureInvestmentValue);
        }
    }
}
