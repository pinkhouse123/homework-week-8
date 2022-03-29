package week8homework;

public class Task6 {
    //main method
    public static void main(String[] args) {
        int r = 10;
        //for loop to get given pattern
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}