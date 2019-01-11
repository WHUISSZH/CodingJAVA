import java.util.Scanner;

public class Quiz_3_19 {
    public static void computeSingel(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入三角形的三条边：");
        double line1 = input.nextDouble();
        double line2 = input.nextDouble();
        double line3 = input.nextDouble();
        if (line1 + line2 <= line3
                || line1 + line3 <= line2
                || line2 + line3 <= line1){
            System.out.print("所输入的三条边无法构成三角形！");
        }else
            System.out.print("周长为：" +(line1 + line2 + line3));
    }
}
