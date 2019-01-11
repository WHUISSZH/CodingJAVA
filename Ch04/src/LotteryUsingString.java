import java.util.Scanner;

public class LotteryUsingString {
    public void lottery(){
        String lotteryString = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();
        char guess1 = guess.charAt(0);
        char guess2 = guess.charAt(1);
        char lotteryDigit1 = lotteryString.charAt(0);
        char lotteryDigit2 = lotteryString.charAt(1);

        System.out.println("The lottery number is " + lotteryString);
        if (guess.equals(lotteryString)){
            System.out.println("Exact match: you win $10000");
        }else if (guess1 == lotteryDigit2 && guess2 == lotteryDigit1){
            System.out.println("Match all digits: you win $3000");
        }else if (guess1 == lotteryDigit1
                || guess1 == lotteryDigit2
                || guess2 == lotteryDigit1
                || guess2 == lotteryDigit2){
            System.out.println("Match one digit: you win $1000");
        }else
            System.out.println("Sorry, no match!");
    }
}
