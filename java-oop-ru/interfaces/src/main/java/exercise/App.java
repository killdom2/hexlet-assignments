package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int value) {
        List<Home> sorted = apartments.stream().
                sorted(Comparator.comparing(Home::getArea)).
                toList();

        for (Home home : sorted) {
            System.out.println(home.toString());
        }

        List<String> apartmentsList = new ArrayList<>();

        if (apartments.isEmpty()) {
            return apartmentsList;
        }
        for (int i = 0; i < value; i++) {
            apartmentsList.add(sorted.get(i).toString());
        }
        return apartmentsList;
    }
}
// END
