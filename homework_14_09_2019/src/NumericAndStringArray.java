import java.util.Arrays;
public class NumericAndStringArray {
    public static void main(String[] args) {

        int a [] = {1234,4321,5678,2222,1133,3344,1255,2255,1166,3588};


        System.out.println("Actual Arrary  : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted Array : "+ Arrays.toString(a));

    }
}
