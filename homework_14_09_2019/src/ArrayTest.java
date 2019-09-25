import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int a[] = {1234, 5678, 1213, 1415, 1718, 2525, 5252, 4567, 1591, 3573};
        System.out.println("Please Enter 2525 To Test If An Array Contains The Entered Value?: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(test(a,2525));
    }

    private static boolean test(int[] a, int i) {
        for (int b : a) {
            if (b == i) {
                return true;
            }
        }
        return false;
    }

}
