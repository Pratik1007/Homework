import java.util.Scanner;

//Program for calculator

public class Calculator {
    int a, b;
    String s1 = "Addition ";
    String s2 = "Subtraction ";
     String s3 = "Multiplication ";
    String s4 = "Division ";
    String s5 = "of Two numbers:-  ";

    public Calculator(int a) {
        this.a = a;
    }

    public void Add() {
        System.out.println("Please Ipnput Any Two Integer Numbers to add:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input First Number:  ");
        a = scan.nextInt();
        System.out.print("Please Input Second Number:  ");
        b = scan.nextInt();
        System.out.println(s1.concat(s5) + (a + b));
    }

    public  void Sub() {
        System.out.println("Please Ipnput Any Two Integer Numbers to Subtract:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input First Number:  ");
        a = scan.nextInt();
        System.out.print("Please Input Second Number:  ");
        b = scan.nextInt();
        System.out.println(s2.concat(s5)+ (a - b));
    }
    public void Multi (){
        System.out.println("Please Ipnput Any Two Integer Numbers to Multiply:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input First Number:  ");
        a = scan.nextInt();
        System.out.print("Please Input Second Number:  ");
        b = scan.nextInt();
        System.out.println(s3.concat(s5)+ (a*b));
    }
    public  void Div (){
        System.out.println("Please Ipnput Any Two Integer Numbers to Divide:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Input First Number:  ");
        a = scan.nextInt();
        System.out.print("Please Input Second Number:  ");
        b = scan.nextInt();
        System.out.println(s4.concat(s5)+ (a/b));
    }
}
