public class Quiz_8_16 {
    void printSortResult(){
        int [][] num = {
                {1, 2},
                {1, 4},
                {3, 3},
                {2, 4},
                {2, 2},
                {6, 2}};

        sort(num);
        Array.printArray(num);
    }

    static void sort(int [][] m){
        for (int i = 0; i < m.length; i++){
            double currentMin = m[i][0];
            int currentMinIndex = i;

            for (int j = i; j < m.length; j++){
                if (currentMin > m[j][0] || (currentMin == m[j][0] && m[currentMinIndex][1] > m[j][1])){
                    currentMin = m[j][0];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                int temp0 = m[currentMinIndex][0];
                int temp1 = m[currentMinIndex][1];
                m[currentMinIndex][0] = m[i][0];
                m[currentMinIndex][1] = m[i][1];
                m[i][0] = temp0;
                m[i][1] = temp1;
            }
        }
    }
}
