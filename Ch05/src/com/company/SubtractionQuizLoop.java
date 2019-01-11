package com.company;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public void subtract(){
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0;
        int correctCount = 0;
        String output = "";
        int number1;
        int number2;
        int numInput;
        long beginTime = System.currentTimeMillis() / 1000;
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){
            number1 = (int)(Math.random() * 10);
            number2 = (int)(Math.random() * 10);

            System.out.printf("What is %d - %d?\n", number1, number2);
            numInput = input.nextInt();

            if (number1 - number2 != numInput){
                System.out.println("You answer is wrong, the right answer is " + (number1 - number2));
            }else if (number1 - number2 == numInput){
                correctCount++;
                System.out.println("You answer is correct");
            }

            count++;
            output += "\n" + number1 + " - " + number2 + " = " + numInput +
                    ((number1 - number2 == numInput) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis() / 1000;
        System.out.printf("\nCorrect count is %d \nTest time is %ds\n%s", correctCount,(endTime - beginTime),output);
    }
}
