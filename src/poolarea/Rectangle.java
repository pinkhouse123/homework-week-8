package poolarea;

public class Rectangle {
    //instance variable
    double width;
    double length;

    //constructor
    public Rectangle(double width, double length) {
        if (width < 0) { //If statement
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;

        }
    }

    //Instance Methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }
}