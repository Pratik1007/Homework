import java.util.ArrayList;

public class RetrieveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("London");
        cityName.add("Manchester");
        cityName.add("Bermingham");
        cityName.add("Edinburgh");

        int size = cityName.size();
        System.out.println("Total City in The List: " + size + "\n");

        for (int i = 0; i < size; i++) {
            System.out.println("City on Index: " + i + " - " + cityName.get(i));
        }

        System.out.println("\n City on Index: 2 is: " + cityName.get(2));
    }

}
