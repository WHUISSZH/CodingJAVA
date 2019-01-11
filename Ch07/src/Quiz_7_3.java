import java.util.Scanner;

public class Quiz_7_3 {
    void countNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers and end with 0: ");
        int[] count = new int[100];
        int num;
        do {
            num = input.nextInt();
            if (num > 0 && num <= 100){
                count[num - 1]++;
            }
        }while (num != 0);

        for (int i = 0; i < 100; i++){
            if (count[i] != 0){
                System.out.printf("%d occurs %d %s\n", i + 1, count[i], (count[i] == 1 ? "time" : "times"));
            }
        }
    }
}
