import java.util.Scanner;
public class EvenDigitSum {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        number = scan.nextInt();
        getEvenDigitSum(number);
    }

    public static void getEvenDigitSum(int number) {
        int rem, sum = 0;

        if (number < 0) {
            System.out.println("-1");
        }

        while (number > 0) {
            rem = number % 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
            number = number / 10;
        }

        System.out.println("sum of Even Digit = " + sum);
    }
}
