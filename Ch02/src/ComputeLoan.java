import java.util.Scanner;

import static java.lang.Math.pow;

public class ComputeLoan {
    public static void computeLoan(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入贷款金额（￥）：");
        double amountOfLoan = input.nextDouble();
        System.out.print("请输入贷款年利率（例如：4.5%）：");
        String rateOfLoan_Str = input.next();
        String[] rateOfLoan_Str1 = rateOfLoan_Str.split("%");
        double rateOfLoan = Double.parseDouble(rateOfLoan_Str1[0]) / 1200;
        System.out.print("请输入支付年数：");
        short yearsOfLoan  = input.nextShort();

        double payAmountPerMonth = (int)(amountOfLoan * rateOfLoan / (1 - 1 / pow(1 + rateOfLoan, yearsOfLoan * 12)) * 100) / 100.0;
        double payAmountPerYear = (int)(payAmountPerMonth * 12 * 100) / 100.0;
        double allPayAmount = (int)(payAmountPerMonth * yearsOfLoan * 12 * 100) / 100.0;

        System.out.println(
                           "贷款利率" +
                    "  " + "贷款金额（元）" +
                     " " + "贷款时间（年）" +
                     " " + "每月应偿还金额（元）" +
                     " " + "每年应偿还金额（元）" +
                     " " + "总偿还金额（元）");
        System.out.println(
                   " " + rateOfLoan_Str +
           "     " + amountOfLoan +
           "         " + yearsOfLoan +
      "           " + payAmountPerMonth +
      "              " + payAmountPerYear +
       "            " + allPayAmount);
    }
}
