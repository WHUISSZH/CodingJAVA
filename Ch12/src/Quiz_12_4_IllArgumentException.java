/**
 * @author callmezh
 * 自定义异常类
 * 仅仅只对构造方法进行了实现，显示调用父类构造方法对子类构造方法进行扩展
 */
public class Quiz_12_4_IllArgumentException extends Exception {
//    double amount;
//    double rate;

    Quiz_12_4_IllArgumentException(){

    }

    Quiz_12_4_IllArgumentException(double amount, double rate){
        super("Invalid amount: " + amount + "\nInvalid rate: " + rate);
//        this.amount = amount;
//        this.rate = rate;
    }

}
