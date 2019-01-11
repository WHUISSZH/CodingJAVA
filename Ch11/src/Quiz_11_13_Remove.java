import java.util.ArrayList;

public class Quiz_11_13_Remove {
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(i);
                    //下一次继续从i开始排查
                    i--;
                    break;
                }
            }
        }
    }
}
