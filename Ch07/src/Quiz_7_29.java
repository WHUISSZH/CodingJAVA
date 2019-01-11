import java.util.Scanner;

public class Quiz_7_29 {
    void printCount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of card: ");
        int numOfCard = input.nextInt();
        System.out.print("Enter the sum you want: ");
        int sum = input.nextInt();

        int pickedTimes = 1;
        while (!(getSumOfCard(numOfCard) == sum)){
            pickedTimes++;
        }
        System.out.print("The picked times are : " + pickedTimes);
    }

    //直接利用random，循环生成每张牌
    private static int getSumOfCard(int numOfCard){
        int[] cardArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int sum = 0;
        for (int i = 1; i <= numOfCard; i++){
            int index = (int)(1 + Math.random() * 52);
            sum += cardArray[index % 13];
        }

        return sum;
    }
 }
