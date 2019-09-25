import java.util.Calendar;

public class DisplayTheDate {
//    25. Write a Java program to display the dates in the following formats.
public static void main(String[] args) {
    Calendar calendar =  Calendar.getInstance();

    System.out.println();
    System.out.println("\nCurrent Date and Time:" + calendar.getTime());
}
}

