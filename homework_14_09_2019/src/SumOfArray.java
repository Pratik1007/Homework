import java.util.Arrays;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        int noe;
        int sum = 0;
        System.out.print("Please Enter Numbers Of Elements You Want To Enter In Array: ");
        Scanner scan =new Scanner(System.in);
        noe = scan.nextInt();
        int a [] = new int[noe];

        System.out.println("Please Enter Values for Selected Numbers Of Elements: ");
        for (int i =0; i < noe; i++){
            a[i] = scan.nextInt();
            sum = sum + a[i];
    }
        System.out.print("Sum Of An Array = "+ sum);
}
}
