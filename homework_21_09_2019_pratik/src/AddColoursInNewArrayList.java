import java.util.ArrayList;
//17. Write a Java program to create a new array list, add some colours (string) and
//printout the collection.
public class AddColoursInNewArrayList {
    public static void main(String[] args) {
        ArrayList <String> colourList = new ArrayList<>();
//        Adding colours in the list
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Black");
        colourList.add("Green");
        colourList.add("White");
//        size of the list
        int size = colourList.size();
        System.out.println("Total Colours In The List Are: " + size);

//        full list
        for (int i = 0; i < size; i++) {
            System.out.println("Colour on Index: " + i + " Is " + colourList.get(i));
        }
    }
}
