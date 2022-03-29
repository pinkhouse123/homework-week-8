package poolarea;

public class Cuboid extends Rectangle {
    //Instance Variables

    double height;

    //Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0) {//If Statement
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Instance Methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;

    }


}