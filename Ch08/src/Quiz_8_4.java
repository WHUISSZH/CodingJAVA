/**
 * 按照总工时降序的方式显示雇员和他们的总工时
 * @author callmezh
 */
public class Quiz_8_4 {
    void printResult(){
        int [][] weeklyHours = Array.createArray(4);
        Array.printArray(weeklyHours);
        int [] hoursOfPerWeek = Array.sumOfRow(weeklyHours);
        //雇员排名
        char [] rank = new char[hoursOfPerWeek.length];

        sortHoursOfPerWeek(hoursOfPerWeek, rank);
        //打印结果
        for (int i = 0; i < hoursOfPerWeek.length; i++){
            System.out.printf("Employee %c\n", rank[i]);
            System.out.printf("Hours Of Per Week %d\n", hoursOfPerWeek[i]);
        }
    }

    /**
     * 降序排列每个人每周工作时间
     * @param hoursOfPerWeek 存储每人每周工作时间的一维数组
     * @param rank 存储未经根据工作时间排序的雇员姓名的一维数组
     */
    private static void sortHoursOfPerWeek(int[] hoursOfPerWeek, char[] rank){
        for (int i = 0; i < hoursOfPerWeek.length; i++){
            rank[i] = (char) ('E' + i);
        }
        //选择排序
        for (int i = 0; i < hoursOfPerWeek.length; i++){
            int maxHours = hoursOfPerWeek[i];
            int maxIndex = i;
            for (int j = i + 1; j < hoursOfPerWeek.length - 1; j++){
                if (maxHours < hoursOfPerWeek[j]){
                    maxHours = hoursOfPerWeek[j];
                    maxIndex = j;
                }
            }

            //交换第 i 个 与 第 maxIndex 个 数， 使第 i 个数是最大的
            if (maxIndex != i){
                hoursOfPerWeek[maxIndex] = hoursOfPerWeek[i];
                hoursOfPerWeek[i] = maxHours;

                //雇员排名对应变换
                char temp = rank[maxIndex];
                rank[maxIndex] = rank[i];
                rank[i] = temp;
            }
        }
    }
}
