import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    //    2. Write a program for ascending order of the number?
    public static void main(String[] args) {
        int a[];
        int noe;
        int i = 0;
        // Selecting the number of elements to input in array
        System.out.print("Please Enter Any Numbers Of Elements You Want To Enter In Array 'a': ");
        Scanner scan = new Scanner(System.in);
        noe = scan.nextInt();
        a = new int[noe];
        // input values for selected number of elements
        System.out.println("Please Enter Values For Selected Number Of Elements: ");
        for (i = 0; i < noe; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Please Find Result Of Entered Values In Ascending Order: ");
        // numbers sorted in Ascending order
        for (int number : a) {
            System.out.println(number);
        }

    }
}



