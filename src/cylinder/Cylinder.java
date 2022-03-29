package cylinder;

public class Cylinder extends Circle {
    //instance variable
    private double height;

    //constructor
    public Cylinder(double radius, double height){
        super(radius);
        if (height < 0){ //If statement
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
