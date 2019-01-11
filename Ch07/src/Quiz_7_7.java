import java.util.Arrays;

public class Quiz_7_7 {
    void printRandomNum(){
        int[] count = new int[10];
        for (int i = 0; i < 100; i++){
            count[createNum()]++;
        }

        System.out.print(Arrays.toString(count));
    }

    static int createNum(){
        return (int)(Math.random() * 10);
    }
}
