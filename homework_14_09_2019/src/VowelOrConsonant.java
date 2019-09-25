import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        alpha();
    }

    public static void alpha() {
        char ch = 0;
        String input;
        System.out.println("Please input an alphabet:");
        Scanner scan = new Scanner(System.in);
//        ch = scan.next().charAt(0);
        input = scan.next();
        ch = input.charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel ");
            } else {
                System.out.println(ch + " is a consonant ");
            }
            if (input.length() > 1) {
            }
        }
            System.out.println("Error Msg: Invalid Entry");

        }
    }
