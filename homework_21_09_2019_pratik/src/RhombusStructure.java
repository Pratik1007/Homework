import java.util.Scanner;

public class RhombusStructure {
//    8. Write a Java program to display the following character rhombus structure.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to Determine the size of the Rhombus structure: ");
        int number = sc.nextInt();
        int c1 = 1;
        int c2 = 1;
        char ch = 'A';

        for (int i = 1; i < (number * 2); i++) {
            for (int spc = number - c2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < number) {
                c2++;
            } else {
                c2--;
            }
            for (int j = 0; j < c1; j++) {
                //print Character
                System.out.print(ch);
                if (j < c1 / 2) {
                    ch++;
                } else {
                    ch--;
                }
            }
            if (i < number) {
                c1 = c1 + 2;
            } else {
                c1 = c1 - 2;
            }
            ch = 'A';

            System.out.println();
        }

    }
}
