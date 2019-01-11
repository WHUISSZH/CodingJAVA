import java.util.Scanner;

public class Quiz_7_4 {
    void analyzeScore(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's score and end with 0: ");
        int lowerCount = 0;
        int higherCount = 0;
        int count = 0;
        double sum = 0;
        //事先确定数组长度
        int[] scoreArray = new int[10];
        int score = input.nextInt();

        while (score != 0){
            sum += score;
            scoreArray[count] = score;
            score = input.nextInt();
            count++;
        }

        double averageScore = sum / count;

        for (int i = 0; i < count; i++){
            if (scoreArray[i] < averageScore){
                lowerCount++;
            }else if (scoreArray[i] >= averageScore){
                higherCount++;
            }
        }

        System.out.printf("average score is %.2f, %d is lower, %d is higher average score!", averageScore, lowerCount, higherCount);
    }
}
