import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int number;
        System.out.println("This Program Will Give You Sum Of The Entered Number's Digits");
        System.out.print("Please Enter any integer Number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        sumDigit(number);

    }

    public static void sumDigit(int number) {
        int sum = 0;
            if (number >= 10) {
                int rem1 = number % 10;
                number = number / 10;
                int rem2 = number % 10;
                number = number / 10;
                sum = sum + number + rem1 + rem2;
                System.out.println("Sum Of The Entered Number's Digits = " + sum);
            }
        else  if (number <= 9) {
            System.out.println(-1 + " - Invalid Value");
        }
    }
}

