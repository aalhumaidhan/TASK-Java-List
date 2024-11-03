import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> favorites = new ArrayList<>();

        favorites.add("Harry Potter Movies Series");
        favorites.add("Trance");
        favorites.add("Circadian Rhythm");
        favorites.add("Borderline");
        favorites.add("Nedamah");

        favorites.remove(2);

        for (String fav : favorites) {
            System.out.println(fav);
        }
    }
}