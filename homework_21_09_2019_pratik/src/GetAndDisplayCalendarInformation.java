import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Collections;
import java.util.ArrayList;

public class GetAndDisplayCalendarInformation {
    //    23. Write a Java program to get and display information (year, month, day, hour,
//                                                             minute) of a default calendar.
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();

        System.out.println();
        System.out.println("\nCurrent Date and Time:" + calendar.getTime());
        int actualMaxYear = calendar.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = calendar.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDay = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);

        System.out.println("Actual Maximum Year: "+actualMaxYear);
        System.out.println("Actual Maximum Month: "+actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
        System.out.println("Actual Maximum Day of Year: "+actualMaxDay);
        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
        System.out.println();
    }
}


