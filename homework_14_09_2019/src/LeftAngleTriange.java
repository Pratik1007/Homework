import java.util.Scanner;
public class LeftAngleTriange {
    public static void main(String[] args) {
        int i = 0, j = 0;
//        System.out.println("Please Input number of rows you want to make:");
//        Scanner scan = new Scanner(System.in);
//        rows = scan.nextInt();

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
//            System.out.print("@");

        }
    }

}
