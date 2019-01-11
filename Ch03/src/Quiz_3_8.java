import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz_3_8 {
public static void sort(){
    Scanner input = new Scanner(System.in);
    double[] num = new double[3];
    for (int i = 0; i < 3; i++) {
        System.out.print("请输入第" + (i + 1) + "个整数：");
        num[i] = input.nextDouble();
    }
    Arrays.sort(num);
    for (int i = 0; i < 3; i++){
        System.out.println(num[i]);
    }
    }
}