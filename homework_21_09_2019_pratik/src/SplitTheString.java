import java.util.Scanner;
public class SplitTheString {
// 7. Write a program to split the string?

    public static void main(String[] args) {
        String s = "My-Name-Is-Pratik-And-I-Am-Learning-Java";
        String parts[] = s.split("-");

        for (int i = 0; i < parts.length; i++) {
            System.out.println("-" + parts[i]);

        }
    }
}
