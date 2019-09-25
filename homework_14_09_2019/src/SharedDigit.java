import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Plese Enter Any Two Numbers Between 10 to 99: ");
        System.out.print("Please Enter First Number: ");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        System.out.print("Please Enter Second Number: ");
        j = scan.nextInt();
        System.out.print(hasSharedDigit(i,j));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)){
            return true;
        }
        return false;
    }
}
