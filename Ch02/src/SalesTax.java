import java.util.Scanner;

public class SalesTax {
    public static void practiceTax() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入营业额（￥）：");
        double amountOfsales = input.nextDouble();
        double tax;
        final double RATE_OF_TAX = 0.006;
        tax = (int)(amountOfsales * RATE_OF_TAX * 1000) / 1000.0;
        System.out.print("所缴营业税为：" + tax + "￥");
    }
}
