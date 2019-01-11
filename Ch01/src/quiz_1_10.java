public class quiz_1_10 {
    public static double practiceSpeedPerHour(String time, double length){
        double speed;
        String[] hour_min_sec = time.split(":|："); //字符串分割符后面不能加空格，加了空格表示分割依据中包含空格
        double[] times = new double[3];
//        for (String element :hour_min_sec) {
//         double times = Double.parseDouble(element);
//         System.out.println(times);
//        }
        for (int i = 0; i < 3; i++){
            times[i] = Double.parseDouble(hour_min_sec[i]);
        }
        speed = length / (times[0] + times[1]/60 + times[2]/3600);
        return speed;
    }
}
