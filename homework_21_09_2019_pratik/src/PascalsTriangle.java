import java.util.Scanner;

public class PascalsTriangle {
    //        11. Write a Java program to display Pascal's triangle.
//        Input number of rows: 5
    public static void main(String[] args) {
        int i, j, rows = 0, k = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input Number Of Rpws Ypu Want To Select: ");
        rows = scan.nextInt();

        for(i=0;i<rows;i++)
        {
            int space;
            for(space=1; space <= rows-i; space++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    k=1;
                else
                    k=k*(i-j+1)/j;
                System.out.print(" "+k);
            }
            System.out.print("\n");
        }
            }
        }




