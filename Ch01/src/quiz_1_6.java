public class quiz_1_6 {
    public static int sumNum(int n) {
        /**
         * 利用sum保存中间结果
         */
//        int sum = 0;
//        for (int i = 0; i < n + 1; i++){
//            sum +=i;
//        }
//        return sum;
/**
 * 递归实现
 */
        if (n == 0){
            return 0;
        }else
        return sumNum(n - 1) + n;
    }

}
