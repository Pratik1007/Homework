import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Please Input Any Number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number > 1 && number % 1 == 0 && number % number == 1) {
            System.out.println("Entered Number Is Prime Number");
        } else {
            System.out.println("Entered Number Is Not Prime Number");
        }
    }
}
