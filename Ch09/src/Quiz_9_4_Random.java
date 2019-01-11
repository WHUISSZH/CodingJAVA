import java.util.Random;

/**
 * @author callmezh
 * Random类
 */
public class Quiz_9_4_Random {
    /**
     * 产生范围在0 - 100 的 50 个随机数
     */
    void printRandom(){
        Random myRandom = new Random();
        myRandom.setSeed(1000);
        int count = 50;
        for (int i = 0; i <= count; i++){
            System.out.println(myRandom.nextInt(100));
        }
    }
}
