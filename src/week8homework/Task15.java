package week8homework;

public class Task15 {
    //static method
    static void leftriangle() {
        int row = 5;//variable
        //for loop statement
        for (int s = 1; s <= row; s++) {
            for (int p = 1; p <= s; p++) {
                System.out.print(" * ");//print statement
            }
            System.out.println("");//print statement
        }
    }

    //main method
    public static void main(String[] args) {
        Task15.leftriangle();
    }
}
