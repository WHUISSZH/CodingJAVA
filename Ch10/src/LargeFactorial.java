import java.math.BigInteger;

/**
 * @author callmezh
 * 阶乘
 */
class LargeFactorial {
    void printResult(){
        System.out.println("50! = " + factorial(50));
    }

    /**
     * for循环实现阶乘
     * @param num
     * @return
     */
    private static BigInteger factorial(int num){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i < num; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
