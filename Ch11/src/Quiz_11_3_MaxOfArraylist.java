import java.util.ArrayList;
import java.util.Random;

public class Quiz_11_3_MaxOfArraylist {
    public static void printResult(){
        Random random = new Random();
        ArrayList <Integer> list = new ArrayList<>();
        int sizeOfList = 10;
        for (int i = 0; i < sizeOfList; i++){
            list.add(i, random.nextInt());
        }
        System.out.print(java.util.Collections.max(list));

    }
}
