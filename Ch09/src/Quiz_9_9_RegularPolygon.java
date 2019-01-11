public class Quiz_9_9_RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    Quiz_9_9_RegularPolygon(){

    }

    Quiz_9_9_RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    Quiz_9_9_RegularPolygon(int n, double side, double x, double y){
        this.side = side;
        this.n = n;
        this.x = x;
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getN(){
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    double getPerimeter(){
        return n * side;
    }

    double getArea(){
        return n * side;
    }
}
