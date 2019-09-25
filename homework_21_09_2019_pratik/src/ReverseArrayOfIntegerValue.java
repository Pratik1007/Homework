import java.util.Arrays;

import java.util.ArrayList;

public class ReverseArrayOfIntegerValue {
    //    13. Write a Java program to reverse an array of integer values.
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int reverse = 0;
        System.out.println("Actual Array is: " + Arrays.toString(a));

        for (int i = 0; i <= a.length /2; i++) {
            reverse = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = reverse;
        }
        System.out.println("Reverse of an Array will be: " + Arrays.toString(a));
    }
}
