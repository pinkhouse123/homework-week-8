package week8homework;

import java.util.Scanner;

public class Task3 {

    //Instance Method
    void pro() {
        int i = 10;//Variables
        Scanner sca = new Scanner(System.in);//Input Scanner Class
        char ch = sca.next().charAt(0);
        //If Condition
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " Input latter is Vowel");
//If else condition
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') && (ch < 1)) {
            System.out.println(ch + " Input Letter is Consonant");//Print Statement
        } else {
            System.out.println("Invalid Input");
        }
    }

    //Main Method
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);// Input Scanner Class
        System.out.println("Enter any letter to check if it is a vowel or consonant :");//Print Statement
        Task3 obj = new Task3();//Object for Instance to Main Method
        obj.pro();
    }
}