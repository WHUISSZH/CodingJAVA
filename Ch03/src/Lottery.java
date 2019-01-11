import java.util.Scanner;

public class Lottery {
    public static void guessLottery(){
        int lottery = (int)(Math.random() * 100);
        //int h = lottery /100;
        int ten = lottery / 10;
        int single = lottery % 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick(three digits):");
        int guess = input.nextInt();
       // int hOfguess = guess / 100;
        int tenOfguess = guess / 10;
        int singleOfguess = guess % 10;
        System.out.println("The lottery number is " + lottery);

        if(guess == lottery){
            System.out.print("Congratulations! you win 10000$");
        }else if(tenOfguess == single && singleOfguess == ten){
                    System.out.print("Congratulations! you win 3000$");
        }else if(tenOfguess == ten
                || tenOfguess == single
                || singleOfguess == ten
                || singleOfguess == single){
            System.out.print("Congratulations! you win 1000");
        }else {
            System.out.print("Sorry, no match!");
        }
    }
}
