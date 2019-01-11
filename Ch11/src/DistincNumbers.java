import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author callmezh
 * 用户输入一个数字序列，然后显示序列中的不同数字
 * 输入 0 表示结束输入
 */
public class DistincNumbers {
    static void printResult(){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0){
                list.add(value);
            }
        }while (value != 0);

        //Display the distinct numbers
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "  ");
        }

        //foreach遍历
        for (int number : list){
            System.out.print(number + "  ");
        }
    }
}
