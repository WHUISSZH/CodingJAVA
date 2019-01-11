/**
 * @author callmezh
 * 动态绑定
 */
public class ClassB extends ClassA {
    /**
     * ClassB 首先隐式调用 父类无参构造方法，在父类构造方法中调用重写后的setI方法
     * 动态绑定，先从本类中调用方法
     */
    public ClassB(){
        System.out.println("I from B is " + i) ;
    }

    @Override
    public void setI(int i){
        this.i = 3 * i;
    }
}
