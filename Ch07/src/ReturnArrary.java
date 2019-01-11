public class ReturnArrary {
    void printResult(){
        int[] list = {1,2,2,3,5};

        for (int e: reverse(list)) {
            System.out.print(e);
        }
    }

    //翻转数组元素
    static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i <= list.length - 1; i++, j--){
            result[j] = list[i];
        }

        return result;
    }
}
