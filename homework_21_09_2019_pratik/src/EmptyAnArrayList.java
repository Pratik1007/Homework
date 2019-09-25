import java.util.ArrayList;
import java.util.Collections;

public class EmptyAnArrayList {
    //    21. Write a Java program to empty an array list
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("Merc");
        carList.add("Jeep");
        carList.add("Toyota");
//  total size of the list
        int size = carList.size();
        System.out.println("Total Cars In The List: " + size);
        System.out.println("\n Car's List As Below \n");

//    get index list of carList
        for (int i = 0; i < size; i++) {
            System.out.println("Car On Index: " + i + " - " + carList.get(i));
        }

        System.out.println("Car's List After Emtptied");
//    Empty an Array List
        carList.clear();
        System.out.print("\n Empty Array Of CarList: " + carList);
    }
}
