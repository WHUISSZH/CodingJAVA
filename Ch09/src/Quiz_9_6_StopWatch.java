public class Quiz_9_6_StopWatch {
    private long startTime;
    private long endTime;

    Quiz_9_6_StopWatch(){
        startTime = System.currentTimeMillis();
    }

    void startTime(){
        startTime = System.currentTimeMillis();
    }

    void endTime(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
