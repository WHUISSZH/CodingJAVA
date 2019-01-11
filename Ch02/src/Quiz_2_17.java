import java.util.Scanner;

import static java.lang.Math.pow;

public class Quiz_2_17 {
    public static void computeTwc(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入温度（摄氏度，范围为-58 — 41）：");
        double temperature = input.nextDouble();
        System.out.print("请输入风速（km/h）：");
        double speedOfWind = input.nextDouble();
        double twc = 35.74 + 0.6215 * temperature - 35.75 * pow(speedOfWind, 0.16) + 0.4275 * temperature * pow(speedOfWind ,0.16);
        twc = (int)(twc * 100) / 100.0;
        System.out.print("风寒温度为：" + twc);
    }
}
