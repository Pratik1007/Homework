import java.util.Scanner;

public class CompareTwoStrings {
//    5. Write a program to compare two strings?
public static void main(String[] args) {
    String s1, s2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Please Input String 's1': ");
    s1 = scan.next();
    System.out.print("Please Input String 's2': ");
    s2 = scan.next();
    if (s1.compareTo(s2) > 0)
        System.out.println("The first string is greater than the second.");
    else if (s1.compareTo(s2) < 0)
        System.out.println("The first string is smaller than the second.");
    else
        System.out.println("Both the strings are equal.");
}
}
