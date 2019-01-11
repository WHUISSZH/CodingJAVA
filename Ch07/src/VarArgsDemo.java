public class VarArgsDemo {
    void printResult(){
        int[] num = printList(1,3,3);
        for (int i = 0; i <= num.length - 1; i++){
            System.out.print(num[i]);
        }

    }

    static int[] printList(int... num){

//        for (int i = 0; i <= 10; i++){
//            num[i] = (int)(Math.random() * 10);
//        }

        return num;
    }

}