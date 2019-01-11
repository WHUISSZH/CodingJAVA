import java.util.Scanner;

public class Quiz_6_29 {
    void printDoublePrime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number：");
        int num = input.nextInt();

        int i = 2;
        while (i <= num){
            if(PrimeNumMethod.isPrimeNum(i) && PrimeNumMethod.isPrimeNum(i + 2)){
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
            i++;
        }
    }
}
