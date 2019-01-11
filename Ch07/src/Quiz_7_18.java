import java.util.Arrays;

public class Quiz_7_18 {
    void printBubbleSort(){
        int[] numArray = {2, 3, 5, 6, 3, 9, 0};
        System.out.println(Arrays.toString(numArray));
        System.out.print(Arrays.toString(bubbleSort(numArray)));
    }

    static int[] bubbleSort(int[] numArray){

        for (int i = 0; i < numArray.length - 1; i++){
            //交换相邻两个数, 还要减去1 是因为 j+1 会超出数组边界
            for (int j = 0; j < numArray.length - 1 - i; j++){
                if (numArray[j] > numArray[j + 1]){
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
            }
        }

        return numArray;
    }
}
