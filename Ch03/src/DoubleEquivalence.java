public class DoubleEquivalence {
    static final double EPSILON = 1E-14;
    public static void compareDouble(){
        double x = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if (Math.abs(x - 0.5) < EPSILON){
            System.out.print( x + " is approximately 0.5");
        }
    }
}
