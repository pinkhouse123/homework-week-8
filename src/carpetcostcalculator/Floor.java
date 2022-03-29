package carpetcostcalculator;

public class Floor {
    private double length;//instance variables
    private double width;

    //constructors
    public Floor(double width, double length) {
        if (width < 0 && length > 0) { //if else
            this.width = 0;
            this.length = length;
        } else if (width > 0 && length < 0) {
            this.width = width;
            this.length = 0;
        } else if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    //instance method
    public double getLength() {
        return width * length;
    }
}