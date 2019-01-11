import java.util.Scanner;

public class Quiz_3_11 {
    public static void showDays(){
        int days = 31;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        switch (month){
            case 2:
                if ((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
                    days = 29;
                }else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        System.out.print( year + "年" + month + "月有" + days + "天");
    }
}
