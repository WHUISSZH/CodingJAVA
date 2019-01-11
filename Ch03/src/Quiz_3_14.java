import java.util.Scanner;

public class Quiz_3_14 {
    public static void guessCoin(){
        int coin = 0;
        if (Math.random() >=0.5){
            coin = 1;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字 0 或 1 ：");
        if (input.nextInt() == coin){
            System.out.print("恭喜你猜对了！");
        }else
            System.out.print("猜错了，不要灰心，再试一次！");
    }
}
