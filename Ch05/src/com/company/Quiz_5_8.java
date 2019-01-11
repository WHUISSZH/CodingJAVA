package com.company;

import java.util.Scanner;

public class Quiz_5_8 {
    public void showMax(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of student: ");
//        int num = input.nextInt();
//        System.out.print("Enter the first student's name: ");
//        String name = input.next();
//        System.out.print("Enter the student' grade: ");
//        int grade = input.nextInt();
//
//        for (int i = 1; i < num; i++){
//            System.out.print("Enter the student's name: ");
//            String nameInput = input.next();
//            System.out.print("Enter the student' grade: ");
//            int gradeInput = input.nextInt();
//
//            if (gradeInput > grade){
//                grade = gradeInput;
//                name = nameInput;
//            }
//        }
//        System.out.printf("Top student is: %s, grade is %d", name, grade);

        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int num = input.nextInt();
        //自定义数组，可以存储name grade
        Quiz_5_8_Student[] studentInfo = new  Quiz_5_8_Student[num];

        do {
            studentInfo[count] = new Quiz_5_8_Student();//需要对每一个数组元素初始化
            System.out.printf("Enter the %d'student'name: ", count + 1);
            String name = input.next();
            studentInfo[count].setName(name);
            System.out.printf("Enter the %d'student'grade: ", count + 1);
            studentInfo[count].setGrade(input.nextDouble());
            count++;
        }while (count < num);
        //冒泡排序
        for (int i = 1; i < num; i++){
            for (int j = i + 1; j < num; j++){
                if (studentInfo[i].getGrade() < studentInfo[j].getGrade()){
                    Quiz_5_8_Student tempStudent;
                    tempStudent = studentInfo[i];
                    studentInfo[i] = studentInfo[j];
                    studentInfo[j] = tempStudent;
                }
            }
        }
        //输出
        for (int i = 0; i < num; i++){
            System.out.printf("%s'grade is %.2f\n", studentInfo[i].getName(), studentInfo[i].getGrade());
        }
    }
}