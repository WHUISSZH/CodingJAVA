/**
 * find the nearest points
 *
 * @author callmezh
 * @date 2018/09/27
 */
public class FindNearestPoint {
    void print2Points(){
        int[][] points = Array.createArray(4);
        Array.printArray(points);

        int p1 = 0;
        int p2 = 1;
        //为什么是points.length
        int [][] nearestPoint = new int[points.length][2];
        int k = 0;
        double shortDis = distance(points[p1], points[p2]);
        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length - 1; j++){
                double dis = distance(points[i], points[j]);
                if (shortDis > dis){
                    shortDis = dis;
                    k = 0;
                    nearestPoint[k][0] = i;
                    nearestPoint[k][1] = j;
                    k++;//每得到一个最小值都要将K值加一
                }else if (shortDis == dis){
                    nearestPoint[k][0] = i;
                    nearestPoint[k][1] = j;
                    k++;
                }
            }
        }
        //打印结果
        //注意 i 与  k 的大小关系
        for (int i = 0; i < k; i++){
            p1 = nearestPoint[i][0];
            p2 = nearestPoint[i][1];
            System.out.printf("The closest points are (%d, %d) (%d, %d)\n", points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        }
    }

    private static double distance(int[] point1, int[] point2){
        return Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2);
    }
}
