public class quiz_1_13 {
    public static void practiceResult(String equation_one, String equation_two){
        String[] abe = equation_one.split("x+|y=");
        String[] cdf = equation_two.split("x+|y=");
        double[] abe1 = new double[3];
        double[] cdf1 = new double[3];
        double result_x, result_y;
        for (int i = 0; i < 3; i++){
            abe1[i] = Double.parseDouble(abe[i]);
            cdf1[i] = Double.parseDouble(cdf[i]);
        }
            result_x = (abe1[2] * cdf1[1] - abe1[1] * cdf1[2]) / (abe1[0] * cdf1[1] - abe1[1] * cdf1[0]);
            result_y = (abe1[0] * cdf1[2] - abe1[2] * cdf1[0]) / (abe1[0] *  cdf1[1] - abe1[1]*cdf1[0]);
            System.out.println("The answer is " + "\n" + "x = " + result_x + "\n" + "y = " + result_y);
}
}
