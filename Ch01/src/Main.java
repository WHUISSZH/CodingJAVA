import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
      //  quiz_1_3.StringTable();

        Scanner input = new Scanner(System.in);

      //System.out.print("请输入数字:");
      //System.out.print("结果为：" + quiz_1_6.sumNum(input.nextInt()));

//      System.out.print("请输入数字:");
//      System.out.println("PI值为：" + 4 * quiz_1_7.practicePI(input.nextInt()));

//        System.out.print("请输入行驶时间(格式为：hour:min:sec)：");
//        String time = input.next();
//        System.out.print("请输入行驶路程(km)：");
//        double length = input.nextDouble();
//        System.out.println("结果为：" + quiz_1_10.practiceSpeedPerHour(time,length) + "km/h");

//        System.out.print("请输入年份：");
//        int year = input.nextInt();
//        System.out.print("未来第" + year + "年的人口数为：" + quiz_1_11.PeopleNum(year));

          System.out.print("请输入第一个方程等式：");
          String equation_one = input.next();
          System.out.print("请输入第二个方程等式：");
          String equation_two = input.next();
          quiz_1_13.practiceResult(equation_one,equation_two);
   }
}
