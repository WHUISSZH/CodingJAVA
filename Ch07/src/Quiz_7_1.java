import java.util.Scanner;

public class Quiz_7_1 {
    void gradeByScore(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of students: ");
        int numOfStudent = input.nextInt();

        double[] score = createScore(numOfStudent);

        double maxScore = maxScore(score);

        grade(score, maxScore);
    }

    static double[] createScore(int n){
        Scanner input = new Scanner(System.in);
        double[] score = new double[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Enter the student %d's score: ", i);
            score[i] = input.nextDouble();
        }
        return score;
    }

    static double maxScore(double[] score){
        double maxScore = score[0];
        for (int i = 0; i < score.length; i++){
            if (maxScore < score[i]){
                maxScore = score[i];
            }
        }
        return maxScore;
    }

    static void grade(double[] score, double maxScore){
        char grade = 'F';
        for (int i = 0; i < score.length; i++){
            double deter = maxScore - score[i];
            if (deter <= 10){
                grade = 'A';
            }else if (deter <= 20){
                grade = 'B';
            }else if (deter <= 30){
                grade = 'C';
            }else if (deter <= 40){
                grade = 'D';
            }
            System.out.printf("Student %d score is %.2f and grade is %c\n", i, score[i], grade);
        }
    }
}
