import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        Scanner scan = new Scanner(System.in);
        System.out.println("User Can Check Their Number Here; Please Enter The Number: ");
        int get = scan.nextInt();

        if(isPalindrome(get)==true){
            System.out.println("This Number is a Palindrome Number: ");
        }
        else {
            System.out.println("This Number is Not Palindrome Number:");
        }

    }


    public static boolean isPalindrome(int number) {

        int sum=0 ,x , y;
        int pali = number;

        while(number>0){
            x = number % 10;
            number = number / 10;
            sum = (sum * 10) + x;
        }


        if(sum == pali){
            return true;
        }

        else return false;

    }

}
