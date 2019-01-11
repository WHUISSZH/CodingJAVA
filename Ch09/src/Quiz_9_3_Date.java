import java.util.Date;

/**
 * @author callmezh
 * 用户自定义时间
 */
public class Quiz_9_3_Date {
    /**
     * 调用date.setDate(time)方法设定时间
     */
    void printDate(){
        Date date = new Date();

        int count = 1;
        long time = 10000;
        final int countBound = 8;
        while (count <= countBound){
            date.setTime(time);
            System.out.println(date.toString());
            count++;
            time *= 10;
        }
    }
}
