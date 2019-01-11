import java.util.Scanner;

public class Quiz_6_1 {
    void printPentagonalNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pentagonal: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 10 == 0){
                System.out.printf("%10d\n", getPentagonalNum(i));
            }else
                System.out.printf("%10d", getPentagonalNum(i));
        }
    }

    private int getPentagonalNum(int n){
        return n * (3 * n - 1) / 2;
    }

}
