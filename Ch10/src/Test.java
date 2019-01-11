/**
 * @author callmezh
 * 数据域问题
 */
public class Test {
    String text;

    public Test(String str){
        //test不是上面定义的test，而是这里的构造方法的局部变量
       String text = str;
    }
}
