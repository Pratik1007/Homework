import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
method();
    }

    public static void method() {
        int n, a = 0, b = 0, c = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value of n:");
        n = scan.nextInt();
        System.out.println("Fibonacci Numbers:");
        for (int i = 0; i <=n; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }
}
