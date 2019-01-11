import java.util.Scanner;

class Quiz_6_17 {
    void printMatrix(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int row = 1; row <= num; row++){
            for (int k = 1; k <= num; k++){
                double randomNum  = Math.rint(Math.random());
                if (k == num){
                    System.out.printf("%3.0f\n", randomNum);
                }else
                    System.out.printf("%3.0f", randomNum);
            }
        }
    }
}
