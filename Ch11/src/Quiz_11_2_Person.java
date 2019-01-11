/**
 * @author callmezh
 * person类，定义基本属性
 */
public class Quiz_11_2_Person {
    String name;
    String address;
    String phoneNum;
    String emailAddress;

    Quiz_11_2_Person(){

    }

    @Override
    public String toString(){
        return "Person's name: " + name + " address: " + address + " phoneNum: "
                + phoneNum + " email address： " + emailAddress;
    }

}
