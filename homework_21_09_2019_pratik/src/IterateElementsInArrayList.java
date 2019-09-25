import java.util.ArrayList;
import java.util.Iterator;

public class IterateElementsInArrayList {
//    18. Write a Java program to iterate through all elements in a array list.
    public static void main(String[]args){

        ArrayList<String> nameList = new ArrayList<>();
        // Adding names in the list
        nameList.add("Pratik");
        nameList.add("Sachin");
        nameList.add("Gaurang");
        nameList.add("Rajendra");
        nameList.add("Divyesh");
        nameList.add("Daxesh");

//        Size
        int size = nameList.size();
        System.out.println("Total Names In The Namelist Are: " + size + "\n");

//        Full index
        for (int i = 0; i < size; i++) {
            System.out.println("Name On Index: " + i + " - " + nameList.get(i));
        }
//            Iterate Through All The Elements In Arraylist
            System.out.println("\n");

            for( String name: nameList){
                System.out.println("The Name Is: " + name);
            }

            nameList.remove(3);
            System.out.println("\n Next For Loop");
        System.out.println("\n Name On Index 3 Has Been Removed From The NameList \n");
            for (String name:nameList){
                System.out.println("The Name Is: "+ name);
            }
//            iterator for the list

            Iterator<String> iter = nameList.iterator();
            System.out.println("\n The Iterator Value Of The List Are: \n");

            while (iter.hasNext()){
                System.out.println(iter.next());
            }

        }
    }

