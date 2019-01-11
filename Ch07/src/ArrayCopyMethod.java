public class ArrayCopyMethod {
    void printResult(){
        arrayCopySystemMothod();
    }

    static void arrayCopySystemMothod(){
        int [] srcArray = {1, 2, 3, 4 , 5, 6};
        int [] targetArray = new int[6];

        System.arraycopy(srcArray, 0, targetArray, 0, 3);
        for (int i = 0; i < 6; i++){
            System.out.print(targetArray[i]);
        }

    }
}
