import java.nio.file.FileSystems;
import java.util.Scanner;

public class ComputeChange {
    public static void computeChane() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要兑换的零钱（$）:");
        String change = input.next();

//        String[] change_str = change.split("\\.");//小数点是特殊字符，要加转义符\\
//        int pennies = (Integer.parseInt(change_str[0]) * 100) + Integer.parseInt(change_str[1]);

        int numOfDollars = 0;
        int pennies = 0;
        if (change.indexOf('.') == -1) {
            numOfDollars = Integer.parseInt(change);
            pennies = 0;
        } else if (change.substring(change.indexOf('.') + 1).length() == 1) {
                numOfDollars = Integer.parseInt(change.substring(0, change.indexOf('.')));
                pennies = Integer.parseInt(change.substring(change.indexOf('.') + 1)) * 10;
           }else if (change.substring(change.indexOf('.') + 1).length() == 2){
                numOfDollars = Integer.parseInt(change.substring(0, change.indexOf('.')));
                pennies = Integer.parseInt(change.substring(change.indexOf('.') + 1));
        }else{
            System.out.print("You must enter the change like 11.45 !");
            System.exit(1);
        }

//        int numOfDollars = (int) (change / 1);
//        int numOfQuarters = (int) ((change - numOfDollars) * 100 / 25);
//        int numOfDimes = (pennies - numOfDollars * 100 - numOfQuarters * 25) / 10;
//        int numOfNickels = (pennies - numOfDollars * 100 - numOfQuarters * 25 - numOfDimes * 10) / 5;
//        pennies = pennies - numOfDollars * 100 - numOfQuarters * 25 - numOfDimes * 10 - numOfNickels * 5;

//         numOfDollars = pennies / 100;
//         pennies %= 100;
         int numOfQuarters = pennies / 25;
         pennies %= 25;
         int numOfDimes = pennies / 10;
         pennies %= 10;
         int numOfNickels = pennies / 5;
         pennies %= 5;

         System.out.print("转换得到的零钱为：");
         if(numOfDollars ==0)
            System.out.print("");
         else if(numOfDollars == 1)
             System.out.print(numOfDollars + " dollar ");
         else if (numOfDollars > 1)
             System.out.print(numOfDollars + " dollars ");

         if (numOfQuarters == 0)
             System.out.print("");
         else if (numOfQuarters == 1)
             System.out.print(numOfQuarters + " quarter ");
         else if (numOfQuarters > 1)
             System.out.print(numOfQuarters + " quarters ");

         if (numOfDimes == 0)
             System.out.print("");
         else if (numOfDimes == 1)
             System.out.print(numOfDimes + " dime ");
         else if (numOfDimes > 1)
             System.out.print(numOfDimes + " dimes ");

         if (numOfNickels == 0)
             System.out.print("");
         else if (numOfNickels == 1)
             System.out.print(numOfNickels + " nickel ");
         else if (numOfNickels > 1)
             System.out.print(numOfNickels + " nickels ");

         if (pennies == 0)
             System.out.print("");
         else if (pennies == 1)
             System.out.print(pennies + " pennies");
         else if (pennies > 1)
             System.out.print(pennies + " pennies");
    }
}
