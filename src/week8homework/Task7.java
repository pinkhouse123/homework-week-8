package week8homework;

public class Task7 {

    private int sumFirstAndLastDigit(int number) {
        if (number < 0) {//If Statement
            return -1;
        }
        int firstDigit = number % 10;
        int lastDigit = 0;
        for (int i = number; i != 0; i /= 10) {
            lastDigit = i % 10;
        }
        return firstDigit + lastDigit;
    }

    //Main Method
    public static void main(String[] args) {
        Task7 obj = new Task7();
        obj.sumFirstAndLastDigit(2252);
        System.out.println(obj.sumFirstAndLastDigit(2));
        System.out.println(obj.sumFirstAndLastDigit(2));
    }
}