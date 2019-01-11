import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author callmezh
 * 列表生成对象数组，对象数组生成列表
 * 只有对象数组才能生成列表
 */
 class ArrayListConverArray {
    static void printResult(){
        String [] array = {"red", "green", "blue"};
        //从对象数组中创建一个数组列表，Arrays类中的aslist方法返回一个列表，该列表传递给
        //ArrayList的构造方法用于创建一个ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        //利用数组列表创建对象数组
        String [] array1 = new String[list.size()];
        //将list中的内容复制到array1中，不是更改引用
        list.toArray(array1);

        //如果列表中的元素是可以比较的，比如整数、双精度浮点数或者字符串
        //则可以使用Java.util.Collection类中的静态方法sort对元素排序

        Integer [] array2 = {2, 44, 34, 43, 65, 76};
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(array2));
        java.util.Collections.sort(integerList);
        System.out.println(integerList);

        //shuffle方法随机打乱列表元素
       java.util.Collections.shuffle(integerList);
       System.out.print(integerList);
    }
}
