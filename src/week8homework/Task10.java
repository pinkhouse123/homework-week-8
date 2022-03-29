package week8homework;

import java.util.Scanner;

public class Task10 {
    int number, originalNumber, remainder, result;

    public void armstrong() {
        originalNumber = number;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result = result + remainder * remainder * remainder;
        }

        if (result == number)
            System.out.println(" is an Armstrong number. ");
        else
            System.out.println(" is not an Armstrong number. ");
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Number ");
        Task10 obj = new Task10();
        obj.number = sca.nextInt();
        sca.close();

        obj.armstrong();
    }

}
