import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        mehtod();
    }

    public static void mehtod() {
        int i, j, rows;
        System.out.println("Please input number of Rows:");
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
//        System.out.println("Please input special character:");
//        i = scan.nextInt();

        for (i = 0; i <= rows; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}
//    int i = 0;
//    int j;
////            char alpha = 0;
////            for (alpha = 'A'; alpha <= 'G'; alpha++) {
//                while (i <= 5) {
//                        j = 1;
//                        while (j++ <= 5 - i) {
//                        System.out.print(" ");
//
//                        }
//                        j = 1;
//                        while (j++ <= i ) {
//                        System.out.print(j);
//
//                        }
//
//                        System.out.println();
//                        i++;
//                        }