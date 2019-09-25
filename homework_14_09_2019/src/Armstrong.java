import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int b, c = 0, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Number To Check Its ArmStrong Number Or Not : ");
        int a = s.nextInt();
        d = a;
        //153
        while (a > 0) {
            b = a % 10;
            a = a / 10;
            c = c + (b * b * b);
        }

        if (c == d) {
            System.out.println("Number is Armstrong ");
        } else {
            System.out.println("Number is not Armstrong  ");
        }
    }
}

