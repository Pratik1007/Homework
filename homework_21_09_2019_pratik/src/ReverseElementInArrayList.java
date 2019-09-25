import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementInArrayList {
    //    20. Write a Java program to reverse elements in a array list.
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
//        Reverse Elements of the Arraylist
        Collections.reverse(carList);
        System.out.println("\n Car's List After Reverse The Elements In The ArrayList As Below\n");
        for (int i = 0; i < size; i++) {
            System.out.println("Car On Index: " + i + " - " + carList.get(i));
        }
    }
}

