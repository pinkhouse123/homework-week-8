package week8homework;

public class Task13 {
    public static boolean hasShardDigit(int number1, int number2) {
        //variables
        int lastdigit1 = 0;
        int lastdigit2 = 0;
        int value = number2;

        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) { //If statement
            while (number1 > 0) { //Do while loop Statement
                lastdigit1 = number1 % 10;
                // System.out.println("Number 2 last Digit: " + lastdigit1);
                do {
                    lastdigit2 = number2 % 10;
                    //  System.out.println("Number 2 last Digit: " + lastdigit2);
                    if (lastdigit1 == lastdigit2) { //If Else Statement

                        return true;
                    } else {
                        number2 /= 10;
                    }
                } while (number2 > 0); //While Statement
                number2 = value;
                number1 /= 10;
            }
        }
        return false;
    }

    //main method
    public static void main(String[] args) {
        boolean num = hasShardDigit(12, 23);//object to calling main method
        System.out.println(num);
        boolean num1 = hasShardDigit(9, 99);//object to calling main method
        System.out.println(num1);
        boolean num2 = hasShardDigit(15, 55);//object to calling main method
        System.out.println(num2);
    }
}
