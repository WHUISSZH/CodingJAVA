import java.util.Scanner;

public class Quiz_6_22 {
    void printSqrt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.printf("The result is %f", sqrt(num));
    }

    double sqrt(double num){
        double nextGuess = 1.0;
        double lastGuess;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + num / lastGuess) / 2;
        }
        while (Math.abs(nextGuess - lastGuess) > 0.00001);

        return nextGuess;
    }
}
