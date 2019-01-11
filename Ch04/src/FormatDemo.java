public class FormatDemo {
    public void printTable(){
        int age = 20;
        System.out.printf("%-10s%-10s%-10s\n", "姓名", "性别", "年龄");
        System.out.printf("%-10s%-10s%-10d\n", "徐泽林", "男", 20);
        System.out.printf("%-10s%-10s%-10d\n", "张光军", "男", age);
        System.out.printf("%-10s%-10s%-10d\n", "张圣航", "男", age);
        System.out.printf("%-10s%-10s%-10d\n", "王悟信", "男", age);
        System.out.printf("%5.2f%% %5.4e\n", 32.327, 32.32);

        short i = 'a';
        long k = 's';
        int x = 0;
        int y = x + i;
        double z = k;
        System.out.print( "" + y + "    " +  z);
    }
}
