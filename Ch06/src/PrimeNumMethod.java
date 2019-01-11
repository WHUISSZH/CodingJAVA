import java.util.Scanner;

public class PrimeNumMethod {
    void printPrimeNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of limitation: ");
        int num = input.nextInt();
        int count = 0;

        //大于等于2，因为这样可以直接排除1的可能性
        while (num >= 2){
            if (isPrimeNum(num)){
                count++;
                if (count % 10 == 0){
                    System.out.printf("%4d\n", num);
                }else
                    System.out.printf("%4d", num);
            }
            num--;
        }
    }

// i 要取到等于 二分之num ， 因为需要考虑到取 4 时的情况
    static boolean isPrimeNum(int num){
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}