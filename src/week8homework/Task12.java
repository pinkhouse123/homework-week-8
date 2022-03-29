package week8homework;

import java.util.Scanner;

public class Task12 {
    public static void isPrime() {
        boolean prime = true;
        int n, a;
        Scanner sc = new Scanner(System.in);//Scanner input
        n = sc.nextInt();
        for (int i = 2; i <= n / 2; i++) {//For Statement
            a = n % i;
            if (a == 0) {//If Statement
                prime = false;
                break;
            }
        }

        if (prime) {//If Statement
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

    }

    //Main Method
    public static void main(String[] args) {

        System.out.println(" Enter a number : ");

        Task12.isPrime();

    }
}