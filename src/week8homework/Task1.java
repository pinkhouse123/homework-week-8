package week8homework;

import java.util.Scanner;

public class Task1 {
    //main method
    public static void main(String[] args)
    {

        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (i <= 10)//while loop to take 10 numbers input from user
        {
            System.out.println("Enter number # " + i + " ");
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                sum = sum + a;
                i++;
            } else {
                System.out.println("Invalid Number");
                break;
            }

        }
        System.out.println("Total of numbers entered is :" + sum);
        sc.close();
    }
}