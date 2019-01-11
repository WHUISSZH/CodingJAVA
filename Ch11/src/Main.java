import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        TestCircleRectangle result = new TestCircleRectangle();
//        result.printResult();

//        new ClassA();
//        new ClassB();

//        Object object1 = new CircleFromSimpleGeometricObject(1);
//        Object object2 = new RectangleFromSimpleGeometricObject(1, 1);
//        CastingDemo.displayObject(object1);
//        CastingDemo.displayObject(object2);

        //检验父类对象是否是其子类的一个实例
//        SuperClassTestInstanceOf testSuperObject = new SuperClassTestInstanceOf();
//        if (testSuperObject instanceof TestInstanceOf){
//        }

//        TestArrayList.printResult();

//        DistincNumbers.printResult();

        /*
        //添加list元素需要前面的元素都已经被填上
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add( "sfsfsf");
        cityList.add( "sfsfsf");
        cityList.add( "gggggg");
        cityList.add( "sfsfsf");

//        for (int i = 0; i < cityList.size(); i++){
//            cityList.remove("sfsfsf");
//        }

        while (cityList.contains("sfsfsf")){
            cityList.remove("sfsfsf");
        }

        System.out.print(cityList.toString());
        */

//        ArrayListConverArray.printResult();

//      Quiz11_1_TestTriangle.printResult();

//        Quiz_11_3_MaxOfArraylist.printResult();

//        Quiz_11_9_MaxNum.printResult();

        /*Scanner input = new Scanner(System.in);
        Quiz_11_10_MyStack myStack = new Quiz_11_10_MyStack();
        int stackDeepth = 3;
        for (int i = 0; i < stackDeepth; i++){
            System.out.printf("Enter the %d's var: ", i);
            myStack.push(input.next());
        }
        System.out.println("strings are: ");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }
        */

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int sizeOfList = 5;
        for (int i = 0; i < sizeOfList; i++){
            list.add(input.nextInt());
        }
        Quiz_11_13_Remove.removeDuplicate(list);
        System.out.print(list.toString());
    }
}