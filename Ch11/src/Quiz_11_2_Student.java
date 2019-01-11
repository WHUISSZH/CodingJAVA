/**
 * @author callmezh
 * student类
 */
public class Quiz_11_2_Student extends Quiz_11_2_Person {
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int SENIOR = 3;

    private int state;

    Quiz_11_2_Student(){

    }

    Quiz_11_2_Student(int  state){
        this.state = state;
    }

    @Override
   public String toString(){
        return "Student's name: " + name + " state " + state;
    }
}
