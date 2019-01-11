import java.util.*;

public class ComputeAndInterpretBMI {
    static final double KILOGRAMS_PER_POUND = 0.45359237;
    static final double METERS_PER_INCH = 0.0254;
    public static void computeBMI(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入体重（磅）：");
        double weight = input.nextDouble();
        System.out.print("请输入身高（英寸）：");
        double height = input.nextDouble();
        double BMI = weight * KILOGRAMS_PER_POUND / Math.pow(height * METERS_PER_INCH, 2);
        System.out.println("BMI is " + BMI);
        if (BMI >= 30){
            System.out.print("Under Weight ");
        }else {
            if (BMI >= 25){
                System.out.print("normal ");
            }else {
                if (BMI >= 18.5){
                    System.out.print("overWeight");
                }else {
                    System.out.print("obese");
                }
            }
        }
    }
}
