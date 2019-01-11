public class Quiz_4_6 {
    public void showRadians(){
        final int R = 40;
        double angle1 = Math.toRadians((int)( Math.random() * 360));
        double angle2 = Math.toRadians((int)( Math.random() * 360));
        double angle3 = Math.toRadians((int)( Math.random() * 360));

        double point1X = R * Math.cos(angle1);
        double point1Y = R * Math.sin(angle1);
        double point2X = R * Math.cos(angle2);
        double point2Y = R * Math.sin(angle2);
        double point3X = R * Math.cos(angle3);
        double point3Y = R * Math.sin(angle3);

        double distanceOf1To2 = Math.pow(point1X - point2X, 2) + Math.pow(point1Y - point2Y, 2);
        double distanceOf1To3 = Math.pow(point1X - point3X, 2) + Math.pow(point1Y - point3Y, 2);
        double distanceOf2To3 = Math.pow(point2X - point3X, 2) + Math.pow(point2Y - point3Y, 2);

        double angelA = Math.toDegrees(Math.acos((distanceOf1To2 + distanceOf1To3 - distanceOf2To3) / (-2 * Math.sqrt(distanceOf1To2 * distanceOf1To3))));
        double angelB = Math.toDegrees(Math.acos((distanceOf1To2 + distanceOf2To3 - distanceOf1To3) / (-2 * Math.sqrt(distanceOf1To2 * distanceOf2To3))));
        double angelC = Math.toDegrees(Math.acos((distanceOf1To3 + distanceOf2To3 - distanceOf1To2) / (-2 * Math.sqrt(distanceOf1To3 * distanceOf2To3))));

        System.out.printf("The three angles are %f, %f, %f", angelA, angelB,angelC);
    }
}
