import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
//    10. Write a Java program to remove a specific element from an array.
public static void main(String[] args) {
    int a[] = {56,25,54,77,52,45,98,35,15,55};
    System.out.println("Actual Arrary  : "+ Arrays.toString(a));
//    Remove the 5th Element - Index = 5, vlaue = 52
int removeindex = 5;
for (int i = removeindex; i < a.length -1; i++){
    a[i] = a[i+1];

}
//After removing the 5th element from the array
    System.out.println("After Removing the 5th Element; New Array Will Be: "+ Arrays.toString(a));

}
}

