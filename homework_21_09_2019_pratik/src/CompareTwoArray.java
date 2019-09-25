import java.util.Scanner;
import java.util.Arrays;
public class CompareTwoArray {
    //3. Write a program to compare two array and its elements are same or not?
    public static void main(String[] args) {
                // Comparision of int Array
        int a[] = {5, 15, 25};
        int b[] = {5, 15, 25};
        int c[] = {5, 10, 35};
        String d[] = {"Jitu, Amit, Arvind, JD"};
        String e[] = {"Jitu, Amit, Arvind, JD"};
        String f[] = {"Pratik, Sachin, Divyesh, RK"};
        if (Arrays.equals(a, b)){
            System.out.println("Array 'a' And Array 'b' Are Same");
        }
        else {
            System.out.println("Array 'a' And Array 'b' Are Not Same");
        }
        if (Arrays.equals(b, c)){
            System.out.println("Array 'b' And Array 'c' Are Same");
        }
        else {
            System.out.println("Array 'b' And Array 'c' Are Not Same");
        }
        if (Arrays.equals(c,a)){
            System.out.println("Array 'c' and Array 'a' Are Same");
        }
        else {
            System.out.println("Array 'c' and Array 'a' Are Not Same");
        }
        if (Arrays.equals(d,e)){
            System.out.println("Array 'd' and Array 'e' Are Same");
        }
        else {
            System.out.println("Array 'd' and Array 'e' Are Not Same");
        }
        if (Arrays.equals(e,f)){
            System.out.println("Array 'e' and Array 'f' Are Same");
        }
        else {
            System.out.println("Array 'e' and Array 'f' Are Not Same");
        }
        if (Arrays.equals(f, d)){
            System.out.println("Array 'f' and Array 'd' Are Same");
        }
        else {
            System.out.println("Array 'f' and Array 'd' Are Not Same");
        }


    }

}
