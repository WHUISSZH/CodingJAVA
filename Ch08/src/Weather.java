public class Weather {
    void printAverageData(){
        //create a array
        int[][][] data = new int[10][24][2];
        for (int day = 0; day < 10; day++){
            for (int hours = 0; hours < 24; hours++){
                for (int i = 0; i < 2; i++){
                     data[day][hours][i] = (int)(Math.random() * 100);
                }
            }
        }
        //compute the average data
        for (int day = 0; day < 10; day++){
            int sumOfTemperature = 0;
            int sumOfHumidity = 0;
            int averageTemper;
            int averageHumidity;
            for (int hour = 0; hour < 24; hour++){
                sumOfHumidity += data[day][hour][0];
                sumOfTemperature += data[day][hour][1];
            }
            averageHumidity = sumOfHumidity / 24;
            averageTemper = sumOfTemperature / 24;
            System.out.printf("Day %d's average humidity is %d\n", day + 1, averageHumidity);
            System.out.printf("Day %d's average temperature is %d\n\n", day + 1, averageTemper);
        }
    }
}
