import java.util.GregorianCalendar;

/**
 * @author callmezh
 * 公历类
 */
public class Quiz_9_5_GregroianCalendar {
    /**
     * 打印日期
     */
    void printGregroianCalendar(){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
    }
}
