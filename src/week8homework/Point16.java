package week8homework;

public class Point16 {
    //Instance variable
    int x;
    int y;
    //Constructor
    Point16() {
    }
    public Point16(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Instance method
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0 - this.getX()) * (0 - this.getX()) + (0 - this.getY()) * (0 - this.getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point16 second) {
        return Math.sqrt((second.getX() - this.getX()) * (second.getX() - this.getX()) + ((second.getY() - this.getY()) * (second.getY() - this.getY())));
    }

    //main method
    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        // Point first = new Point(6, 5);
        // Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }

}