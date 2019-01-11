/**
 * @author callmezh
 * 动态绑定
 */
public class ClassA {
    int i = 7;
    ClassA(){
        setI(20);
        System.out.println("I from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}