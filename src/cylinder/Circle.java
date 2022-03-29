package cylinder;

public class Circle {

    //private static final double PI = 3.14;
    //Instance Variable
    private double radius;

    //Constructor
    public Circle(double r) {
        this.radius = r;
        if (r < 0) {//If Statements
            r = 0;
        } else {
            radius = r;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}