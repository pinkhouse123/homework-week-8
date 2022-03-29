package carpetcostcalculator;

public class Calculator {
    private double floor;//Instance method
    private double carpet;

    //constructor
    public Calculator(double floor, double carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //Instance method
    public double getTotalCost() {
        return this.floor * this.carpet;

    }
}
