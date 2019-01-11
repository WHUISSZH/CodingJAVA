import java.util.Scanner;

public class Quiz_2_13 {
    public static void getInterest(){
        double interest = 0;
        double allMoney = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入每月定投金额（￥）：");
        double amount = input.nextDouble();
        System.out.print("请输入存期（月）：");
        int months = input.nextInt();
        for(int i = 1; i < months + 1; i ++){
            allMoney = (amount + allMoney) * 1.00417;
            interest = allMoney - amount * months;
        }
        System.out.print("到期得利息" + interest + "元，本金加利息共得" + (int)(allMoney * 100) / 100.0 + "元");
    }
}
