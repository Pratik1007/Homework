import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int a[];
        int noe;
        int sum = 0;
        System.out.print("Please Enter Numbers Of Elements You Want To Input: ");
        Scanner scan = new Scanner(System.in);
        noe = scan.nextInt();
        a = new int[noe];
        System.out.println("Please Enter Values For Selected  Numbers Of Elements:");
        for (int i = 0; i < noe; i++) {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        System.out.print("Average Value Of Array Elemetns = " + (sum / noe));
    }
}