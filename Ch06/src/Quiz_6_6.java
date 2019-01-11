import java.util.Scanner;

public class Quiz_6_6 {
    void printPattern(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        dipalyPattren(num);
    }

    static void dipalyPattren(int num){
        for (int i = 1; i <= num; i++){

            for (int k = i; k < num; k++){
                System.out.print("    ");
            }

            for (int j = i; j >= 1; j --){
                if (j == 1){
                    System.out.printf("%4d\n", j);
                }else
                    System.out.printf("%4d", j);
            }
        }
    }
}
