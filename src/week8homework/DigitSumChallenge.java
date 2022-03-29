package week8homework;

import java.util.Scanner;

public class DigitSumChallenge {

    public static void sumDigit(int number) {
        //one int parameter called number
        int sum = 0, lastDigit, n = number;
        while (number > 0) {
            lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println("Sum of the Digit of number " + n + " is :" + sum);

    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find sum of all digits :");
        int n = sc.nextInt();
        sc.close();
        sumDigit(n);//calling static method directly
    }
}
