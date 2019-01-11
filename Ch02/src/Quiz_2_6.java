import static java.lang.Math.random;

public class Quiz_2_6 {
    public static void sumNum(){
        int oldDum = (int) (random() * 100000);
        int newNum = oldDum;
        int tenThured = newNum / 10000;
        newNum %= 10000;
        int thured = newNum / 1000;
        newNum %= 1000;
        int hundred = newNum / 100;
        newNum %= 100;
        int ten = newNum / 10;
        int singel = newNum % 10;

        System.out.println("随机得到的数字为：" + oldDum);
        System.out.println("各数位相加得：" + ( tenThured + thured + hundred + ten + singel));
    }
}
