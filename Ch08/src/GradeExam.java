import java.util.Arrays;

@SuppressWarnings("ALL")
public class GradeExam {
    void printGrade(){
        char[][] answersAndStudents = {
                {'A', 'B', 'C', 'D'},
                {'C', 'D', 'A', 'C'},
                {'A', 'B', 'B', 'C'}};

        char[] key = {'A', 'C', 'A', 'C'};

        for (int i = 0; i < answersAndStudents.length; i++){
            int correctCount = 0;
            for (int j = 0; j < answersAndStudents[i].length - 1; j++){
                    if (answersAndStudents[i][j] == key[j]){
                        correctCount++;
                    }
            }
            System.out.printf("The %c's student correct count is %d\n", answersAndStudents[i][4], correctCount);
        }
    }
}
