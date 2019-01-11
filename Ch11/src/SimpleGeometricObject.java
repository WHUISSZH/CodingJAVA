import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color and filled value */
    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    @Override
    public String toString(){
        return "create on " + dateCreated + "\ncolor: " + color + "and filled: " + filled;
    }
}
