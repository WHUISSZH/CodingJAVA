import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author callmezh
 * 利用继承实现栈类
 */
public class Quiz_11_10_MyStack extends ArrayList {

    Quiz_11_10_MyStack(){

    }

    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return size();
    }

    public Object peek(){
        return get(size() - 1);
    }

    public Object pop(){
        return remove(getSize() - 1);
    }

    public Object push(Object o){
        add(o);
        return o;
    }

    public int search(Object o){
        return indexOf(o);
    }

    @Override
    public String toString(){
        return "stack: " + toString();
    }
}
