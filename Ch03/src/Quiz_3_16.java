import java.util.Scanner;

public class Quiz_3_16 {
    public static void game(){
        int computerNum = (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor(0), rock(1), paper(2): ");
        int userNum = input.nextInt();
        switch (computerNum){
            case 0:
                if (userNum == 0){
                    System.out.print("The computer is scissor, you are scissor too.It is a draw");
                }else if (userNum == 1){
                    System.out.print("The computer is scissor, you are rock. You won!");
                }else if (userNum == 2){
                    System.out.print("The computer is scissor, you are paper. You lose!");
                }
                break;
            case 1:
                if (userNum == 0){
                    System.out.print("The computer is rock, you are scissor. You lose!");
                }else if (userNum == 1){
                    System.out.print("The computer is rock, you are rock too. It is a draw!");
                }else if (userNum == 2){
                    System.out.print("The computer is rock, you are paper. You won!");
                }
                break;
            case 2:
                if (userNum == 0){
                    System.out.print("The computer is paper, you are scissor. You won!");
                }else if (userNum == 1){
                    System.out.print("The computer is paper, you are rock. You lose!");
                }else if (userNum == 2){
                    System.out.print("The computer is paper, you are paper too. It is a draw!");
                }
        }
    }
}
