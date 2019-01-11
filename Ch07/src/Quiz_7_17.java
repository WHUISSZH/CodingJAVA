import java.util.Arrays;
import java.util.Scanner;

class Quiz_7_17 {
    void printStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int n = input.nextInt();
        String[] name = new String[n];
        double[] score = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Enter %d student name: ", i + 1);
            name[i] = input.next();
            System.out.printf("Enter %d student score: ", i + 1);
            score[i] = input.nextDouble();
        }

        sort(name, score);
    }

    private static void sort(String[] name, double[] score){
        for (int i = 0; i < score.length; i++){
            //要写在for里面，不然不会更新minScore的值，每次假定score[i]是最小的
            double minScore = score[i];
            int minIndex = i;

            for (int j = i + 1; j < score.length; j++){
                if (score[j] < minScore){
                    minScore = score[j];
                    minIndex = j;
                }
            }

            //swap分数与姓名，让最小的分数和其对应的姓名排在前面。
            if (minIndex != i){
                score[minIndex] = score[i];
                score[i] = minScore;

                String temp = name[minIndex];
                name[minIndex] = name[i];
                name[i] = temp;
            }
        }

        System.out.println("name: " + Arrays.toString(name));
        System.out.print("score: " + Arrays.toString(score));
    }
}
