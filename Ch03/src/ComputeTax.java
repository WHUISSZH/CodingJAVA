import java.util.Scanner;

public class ComputeTax {
    public static void computeTax(){
        double tax = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入登记身份（0代表单身纳税人，1代表已婚纳税人，2代表家庭户主纳税人）：");
        byte id = input.nextByte();
        switch (id){
            case 0:
                System.out.print("请输入月收入（$）：");
                double salary = input.nextDouble();
                if(salary <= 8350)
                    tax = salary * 0.1;
                else if(salary <= 33950)
                    tax = 8350 * 0.1 + (salary - 8350) * 0.15;
                else if(salary <= 52250)
                    tax = 8350 * 0.1 + (salary - 8350) * 0.15 + (salary - 33950) * 0.25;        System.out.print("税费为：" + tax + "$");
                System.out.print("税费为：" + tax + "$");
                break;
            case 1:
                System.out.print("请输入月收入（$）：");
                salary = input.nextDouble();
                if(salary <= 16700)
                    tax = salary * 0.1;
                else if(salary <= 67900)
                    tax = 8350 * 0.1 + (salary - 16700) * 0.15;
                else if(salary <= 137050)
                    tax = 8350 * 0.1 + (salary - 16700) * 0.15 + (salary - 137050) * 0.25;
                System.out.print("税费为：" + tax + "$");
                break;
            case 2:
                System.out.print("请输入月收入（$）：");
                salary = input.nextDouble();
                if(salary <= 11950)
                    tax = salary * 0.1;
                else if(salary <= 45500)
                    tax = 8350 * 0.1 + (salary - 11950) * 0.15;
                else if(salary <= 52250)
                    tax = 8350 * 0.1 + (salary - 11950) * 0.15 + (salary - 52250) * 0.25;
                System.out.print("税费为：" + tax + "$");
                break;
            default:
                System.out.println("请输入正确登记身份！");
                computeTax();
        }
//
//        if (id == 0){
//            System.out.print("请输入月收入（$）：");
//            double salary = input.nextDouble();
//            if(salary <= 8350)
//                tax = salary * 0.1;
//            else if(salary <= 33950)
//                tax = 8350 * 0.1 + (salary - 8350) * 0.15;
//            else if(salary <= 52250)
//                tax = 8350 * 0.1 + (salary - 8350) * 0.15 + (salary - 33950) * 0.25;        System.out.print("税费为：" + tax + "$");
//            System.out.print("税费为：" + tax + "$");
//        }else if(id == 1){
//            System.out.print("请输入月收入（$）：");
//            double salary = input.nextDouble();
//            if(salary <= 16700)
//                tax = salary * 0.1;
//            else if(salary <= 67900)
//                tax = 8350 * 0.1 + (salary - 16700) * 0.15;
//            else if(salary <= 137050)
//                tax = 8350 * 0.1 + (salary - 16700) * 0.15 + (salary - 137050) * 0.25;
//            System.out.print("税费为：" + tax + "$");
//        }else if(id == 2){
//            System.out.print("请输入月收入（$）：");
//            double salary = input.nextDouble();
//            if(salary <= 11950)
//                tax = salary * 0.1;
//            else if(salary <= 45500)
//                tax = 8350 * 0.1 + (salary - 11950) * 0.15;
//            else if(salary <= 52250)
//                tax = 8350 * 0.1 + (salary - 11950) * 0.15 + (salary - 52250) * 0.25;
//            System.out.print("税费为：" + tax + "$");
//        }else {
//            System.out.println("请输入正确登记身份！");
//            computeTax();
//            //System.exit(1);
//        }
    }
}
