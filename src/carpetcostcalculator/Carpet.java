package carpetcostcalculator;

public class Carpet {
    private double cost;//instance variables

    //constructor
    public Carpet(double cost) {
        if (cost < 0) {//if else statement
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}