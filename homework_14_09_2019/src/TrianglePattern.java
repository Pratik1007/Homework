
import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        method();
    }
        
        public static void method() {
            int i, j, rows;
            System.out.println("Please input number of Rows:");
            Scanner SC = new Scanner(System.in);
            rows = SC.nextInt();

            for (i = 1; i <= rows; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

