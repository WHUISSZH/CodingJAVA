import java.util.Scanner;

public class ShowCurrentTime {
   public static void practiceCurrentTime() {
       long totalMills = System.currentTimeMillis();
       long totalSeconds = totalMills / 1000;
       long totalMins = totalSeconds / 60;
       long totalHours = totalMins / 60;
       long totalDays = totalHours / 24;
       long totalYears = totalDays / 365;

       long currentSeconds = totalSeconds % 60;
       long currentMins = totalMins % 60;
       long currentHours = totalHours % 24;
       long currentDays = totalDays % 365;
       long currentMonth = currentDays / 30;
       long currentDate = currentDays % 30;
       long currentYears = totalYears + 1970;

       Scanner input = new Scanner(System.in);
       System.out.print("请输入相对于GMT的时区偏移量（例如东八时区需输入 8 ，西八时区需输入 -8 ）：");
       int detaGMT = input.nextInt();
       if (detaGMT > -1 && detaGMT < 13) {
           System.out.print("当前时间为：" + currentYears + "/" + currentMonth + "/" + currentDate + " " + ((currentHours + detaGMT ) % 12) + ":" + currentMins + ":" + currentSeconds);
           if (currentHours + detaGMT > 12){
               System.out.println(" PM");
           }else
               System.out.println(" AM");

       }else if(detaGMT > -13 && detaGMT < 0) {
               System.out.println("当前时间为：" + currentYears + "/" + currentMonth + "/" + currentDate + " " + ((currentHours + detaGMT + 24) % 12) + ":" + currentMins + ":" + currentSeconds);
           if (currentHours + detaGMT > 12){
               System.out.println(" PM");
           }else
               System.out.println(" AM");

       }else {
                   System.out.println("时区输入有误，时区范围应在西十二时区与东十二时区之间,请重新输入");
                   practiceCurrentTime();
           }
   }
}
