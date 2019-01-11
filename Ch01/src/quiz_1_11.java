import java.text.DecimalFormat;

public class quiz_1_11 {
    public static String PeopleNum(int year){
        final int STATE_PEOPLE_NUM = 312032486;
        final int SECOND_OF_YEAR = 365 * 24 * 60 * 60;
        int peopleNum = STATE_PEOPLE_NUM + year * SECOND_OF_YEAR / 5 + year * SECOND_OF_YEAR / 45;
        DecimalFormat addDecFormat = new DecimalFormat();
        addDecFormat.applyPattern("#,###");
        return addDecFormat.format(peopleNum);
    }
}
