import java.util.Arrays;

public class Quiz_7_16 {
    void printComputeTime(){
        int key = (int)(Math.random() * 1000000);
        int[] randomNumArray = getRandomNumArray();

        long startTime = System.currentTimeMillis();
        int keyIndexLineSearch = lineSearch(randomNumArray, key);
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.printf("The key number index is %d, cost time is %d\n", keyIndexLineSearch, costTime);


        long startTime2 = System.currentTimeMillis();
        int keyIndexBinarySearch = binarySearch(randomNumArray, key);
        long endTime2 = System.currentTimeMillis();
        long costTime2 = endTime2 - startTime2;
        System.out.printf("The key number index is %d, cost time is %d\n", keyIndexBinarySearch, costTime2);

    }

    private static int[] getRandomNumArray(){
        int[] randomNum = new int[1000000];
        for (int i = 0; i < 1000000; i++){
             randomNum[i] = (int)(Math.random() * 1000000);
        }
        return randomNum;
    }

    static int lineSearch(int[] array, int key){
        int keyIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                keyIndex = i;
                break;
            }
        }
        return keyIndex;
    }

    static int binarySearch(int[] array, int key){
        Arrays.sort(array);
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex >= highIndex){
            //防止 lowerIndex + highIndex 溢出
            int midIndex = lowIndex + (highIndex -lowIndex) / 2;
            if (key == array[midIndex]){
                return midIndex;
            }else if (key < array[midIndex]){
                highIndex = (midIndex - 1);
            }else if (key > array[midIndex]){
                lowIndex = midIndex + 1;
            }
        }

        return -1;
    }
}
