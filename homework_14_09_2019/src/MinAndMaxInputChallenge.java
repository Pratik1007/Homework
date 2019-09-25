import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        int number = 0;
        int min = 0;
        int max = 0;
        System.out.println("Enter Number: ");

        Scanner SC = new Scanner(System.in);
        number = SC.nextInt();
        min = number;
        max = number;
//        System.out.println("Enter Number:");
        while (number >= 0) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            System.out.println("Enter Number: ");
            number = SC.nextInt();
        }
        System.out.println("Minimum Number = " + min);
        System.out.println("Maximum Number = " + max);

    }
}

