public class Quiz_11_2_Faculty extends Quiz_11_2_Employer{
    private static int LECTURER = 1;
    private static int ASSISTANT_PROFESSOR = 2;
    private static int ASSOCIATE_PROFESSOR = 3;
    private static int PROFESSOR = 4;

    private double workTime = 8;
    private int rank;

    Quiz_11_2_Faculty(){

    }

    @Override
    public String toString() {
        return "Faculty";
    }
}
