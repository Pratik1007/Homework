import java.util.Scanner;

public class ReadingUserInputChallenge {


    public static void main(String[] args) {
        System.out.println("This Program will allow user to enter 10 numbers and have sum of all entered numbers");
        System.out.println("Please Enter 10 Numbers:");
        method();
    }

    public static void method() {
        Scanner scan = new Scanner(System.in);
        int x[], sum = 0, i = 0;
        x = new int[10];
        while (i < 10) {
            System.out.print("Enter number #" + (i + 1) + " : ");
            if (scan.hasNextInt()) {
                x[i] = scan.nextInt();
                sum = sum + x[i];
                i++;
            } else {
                System.out.println("Invalid Number");
                scan.next();
            }
        }
        scan.close();
        System.out.println("Sum of all 10 entered numbers = " + sum);

    }
}




