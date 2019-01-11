import java.util.Arrays;

public class SelectionSort {
    void selectionSort(){
        double[] list = {3, 2, 5, 4, 5, 9, 7, 1};

        for (int i = 0; i <= list.length - 1; i++){
            //find the min number in the list
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j <= list.length - 1; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

        System.out.println(Arrays.toString(list));
    }
}