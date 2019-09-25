import javax.swing.*;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-55));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstdigit = 0;
        int lastdigit = 0;
        firstdigit = number;
        if (number >= 0 && number <= 9) {
            return number;
        } else if (number > 9) {
            while (firstdigit >= 10) {
                firstdigit = firstdigit / 10;
                lastdigit = number % 10;
            }

            return firstdigit + lastdigit;
        }
        return -1;
    }
}


