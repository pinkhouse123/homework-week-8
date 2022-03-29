package sumcalculator;

public class SimpleCalculator {
    //variable
    private double firstNumber;
    private double secondNumber;

    //getters
    //with return type no parameter
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
        //return result;
    }

    //with return type with parameter
    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        if (secondNumber == 0 || firstNumber == 0) {
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }

    //setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static void main(String[] args) {
        //Write your code here
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }
}