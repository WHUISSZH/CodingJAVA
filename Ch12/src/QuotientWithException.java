import java.util.Scanner;

/**
 * @author callmezh
 * 异常处理举例，除数不能为零
 */
class QuotientWithException {

    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two Integer: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            double result = quotient(num1, num2);
            System.out.printf("%d + %d = %.3f\n", num1, num2, result);
        }catch (ArithmeticException ex){
            System.out.print("Exception: an integer cannot be divided by zero ");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.print("一个try语句可以匹配多个catch语句");
        }
        System.out.print("Execution continues...");
    }

    private static double quotient(int num1, int num2){
        if (num2 == 0){
            //throw 语句抛出一个由异常类创建的异常对象
            //当异常被抛出时，正常执行流程被中断
            //throw语句类似方法的调用，但不同的是，throw语句调用的是catch语句
            //抛出的异常类型匹配catch语句的异常类型，
            //意味着一个try语句后可以有多个catch语句
            //在执行完catch块后，程序控制不返回到throw语句，而是执行catch块后的下一条语句
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return (double)num1 / num2;
    }

    /**
     * Exception 需要在方法头声明
     * @param value int型值
     * @throws Exception 异常
     */
    public void m(int value) throws Exception{
        if (value < 40){
            throw new Exception("value is too small");
        }
    }
}