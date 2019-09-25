import java.util.Scanner;

public class PrintTheGrid {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int i, j;

        for (i = 0; i <= 7; i++) {
            for (j = 0; j <= 10; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
