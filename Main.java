import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

enum Color {
    RED, GREEN, BLUE, BLACK, WHITE, YELLOW
}
public class Main {
    public static void main(String[] args) {
        Map<String, Color> favoriteColors = new TreeMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mary", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("- Comparing HashMap and TreeMap");
            System.out.println("   HashMap stores data without sorting and provides fast search (O(1) on average), while TreeMap stores data in a sorted order (O(log n) due to the Red-Black Tree) and requires keys to be comparable. For example, HashMap stores data using hashing and does not sort it, whereas TreeMap stores data using a Red-Black Tree.");
            System.out.println("- Observe the behavior of the new code");
            System.out.println("   The keys will be automatically sorted in alphabetical order, and the data will be displayed according to the key's order, such as Adam, Cole, Eve, Juliet, Mary, Pedro, Robert, and Romeo. This is a characteristic of TreeMap that helps in displaying data in a specified order.");
        }
    }
}