
import java.util.Scanner;

public class ReverseString {
    //    6. Write a program to reverse the string
    public static void main(String[] args) {
        String s, reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Any String: ");
        s = scan.next();
        int length = s.length();
        int i;
        for (i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.print("Reverse Of The String = " + reverse);

    }
}
