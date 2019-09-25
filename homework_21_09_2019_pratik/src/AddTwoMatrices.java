import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int m1[][], m2[][], sum[][];
        int i, j;
        int k = 0;
        int l = 0;
        // Selecting the number of rows to input
        System.out.print("Please Enter Numbers Of Rows You Want To Enter in Mtrix: ");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        // Selecting the number of columns to input
        System.out.print("Please Enter Numbers Of Columns You Want To Enter in Matrix: ");
        j = scan.nextInt();

        m1 = new int[i][j];
        m2 = new int[i][j];
        sum = new int[i][j];
        // input values of elements
        System.out.println("Please Enter Values Of Elements For First Matrix m1: ");
        for (k = 0; k < i; k++) {
            for (l = 0; l < j; l++) {
                m1[k][l] = scan.nextInt();
            }
        }
        System.out.println("Please Enter Values Of Elements For Second Matrix m2: ");
        for (k = 0; k < i; k++) {
            for (l = 0; l < j; l++) {
                m2[k][l] = scan.nextInt();
            }
        }
        for (k = 0; k < i; k++) {
            for (l = 0; l < j; l++) {
                sum[k][l] = m1[k][l] + m2[k][l];
            }
        }
        //        a1 and a2 both matrices are same size
//        if (m1[k][l] == m2[k][l]) {
//            System.out.println("Addition of Matrices m1 and m2 is: " + sum[k][l]);
//
//        }
//        else {
//            System.out.println("Matrices m1 And m2 Are Not Same Size");
        System.out.println("Addition of Matrices m1 and m2 is: ");

        for (k = 0; k < i; k++) {
            for (l = 0; l < j; l++) {
                System.out.print(sum[k][l]+ "\t");
                System.out.println();
            }
        }
    }

}



