
import java.util.Scanner;

public class ReverseNumber {
    private static Object ArrayList;

    //    1. Write a program to reverse the given number?
    public static void main(String[] args) {
        int a, reverse = 0;
        // Enter any number by using the scanner
        System.out.println("Please Input any Interger Numbers in Array: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        // Conditing with using a While loop
        while (a != 0) {
            int number = a % 10;
            a /= 10;
            reverse = reverse * 10 + number;
        }
        // Result
        System.out.println("Reverse of the given number = " + reverse);

    }
}
