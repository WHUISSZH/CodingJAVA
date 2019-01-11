public class quiz_1_7 {
    public static double practicePI(int n){
        if (n==1){
            System.out.println("请输入大于0的整数");
            return 1;
        }else {
            System.out.println("no problem");
            return practicePI(n - 2) + (Math.pow(-1, (n + 1) / 2 + 1) * (1.0 / n));
        }
    }
}
