import java.util.Arrays;

public class TestArray {
    void printResult(){
//        sort();
//        equalsStr();
        fillArray();
    }

    static void sort(){
        int[] num = {2, 2, 4, 5, 0, 6, 3};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //char[0]--char[3 - 0]
        char[] chars = {'8', '7', '5', '2', '1'};
        Arrays.sort(chars, 0, 3);
        System.out.println(chars);

        //不可以对string排序
        String[] str = {"d", "f", "f"};
        Arrays.sort(str);
        System.out.println(str);
    }

    //要内容（包括顺序）完全一样才返回true
    static void equalsStr(){
        String[] str = {"qwe", "wer"};
        String[] strings = {"qwe", "we"};
        boolean i = Arrays.equals(str, strings);
        System.out.println(i);
    }

    static void fillArray(){
        int[] num = {1,2,3,4,5,6};
        int[] numbers = {1,2,3,4};

        Arrays.fill(num, 9);
        Arrays.fill(numbers, 0, 3, 8);
        System.out.println(Arrays.toString(numbers));
    }
}