import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_11_17_TatalSquare {
    static void printResult(){
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);

    }

    /**
     * 得到 M 的因子
     * @param m 用户输入的数
     * @return 存储因子的列表数组
     */
    private ArrayList<Integer> getFact(int m){
        int fact = 2;
        ArrayList<Integer> factList = new ArrayList<>();
        while (fact < m / 2){
            if (m % fact == 0){
                factList.add(fact);
                m /= fact;
            }else if (m % fact != 0){
                fact++;
            }
        }
        return factList;
    }

    private int getMultiResult(ArrayList<Integer> list){
         int n = 1;
         int i = 1;
         while (i < list.size() - 1){
             if (!list.get(i).equals(list.get(i + 1))){
                 n *= list.get(i);
                 i++;
             }else {
                 i += 2;
             }
         }
        if (i == list.size() - 1){
            n *= list.get(i);
        }
        return n;
    }
}
