package week8homework;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        //method with one int parameter called number
        int reverse = 0, lastDigit, n = number;
//logic to get palindrome number
        while (n > 0) {
            lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        if (number == reverse && number >= 0 || number <= 0) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) //main method
    {
        System.out.println("Enter number to check if it is a palindrome number or not :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));//calling static method directly
    }
}
