import java.util.Arrays;

class Quiz_7_20 {
    void printSelectionSort(){
        int[] numArray = {3, 4, 6, 8 ,9 , 0, 5, 2};
        System.out.print(Arrays.toString(selectionSort(numArray)));
    }

    private static int[] selectionSort(int[] list){
        for (int i = list.length - 1; i >= 0; i--){
            int max = list[i];

            for (int j = i - 1; j >= 0; j--){
                if (list[j] > max){
                    max = list[j];

                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
