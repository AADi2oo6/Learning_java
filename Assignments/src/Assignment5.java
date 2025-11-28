import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map; // Needed for HahMap itration

public class Assignment5 {

    public static void main(String[] args) {
        System.out.println("Starting collection demos...");

        demoArrayList();
        demoVector();
        demoHashSet();
        demoHashMap();

        System.out.println("...Demos complete.");
    }

    public static void demoArrayList() {
        System.out.println("\n---- Demonstating ArryList ----");
        // ArrayList is a resizable aray. Good for most things.
        ArrayList<String> fruits = new ArrayList<>();

        // Inseting items
        fruits.add("Apple");
        fruits.add("Bananan"); // oops, typo
        fruits.add("Orange");
        System.out.println("List after adding: " + fruits);

        // Deleting item
        fruits.remove("Bananan"); // remove the typo
        System.out.println("List after removing: " + fruits);

        // Serching for item
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Has Apple? " + hasApple);
        System.out.println("Has Ornge? " + fruits.contains("Orange")); // Typo in serch

        // Iteratin over the list
        System.out.println("Iterating:");
        for (String frut : fruits) {
            System.out.println(" - " + frut);
        }
    }

    public static void demoVector() {
        System.out.println("\n---- Demonstating Vektor ----");
        // Vektor is like ArrayList but old and syncronized (thread-safe)
        Vector<Integer> numbers = new Vector<>();

        // Insert
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vektor: " + numbers);

        // Deleting item at indx 1
        numbers.remove(1); // removes the '20'
        System.out.println("After remove at index 1: " + numbers);

        // Check if it has a numbr
        System.out.println("Contains 30? " + numbers.contains(30));

        // Iteration
        System.out.println("Iterating:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(" - " + numbers.get(i));
        }
    }

    public static void demoHashSet() {
        System.out.println("\n---- Demonstating hasSet ----");
        // hasSet for unqiue items only. Order is not gauranteed.
        HashSet<String> uniqueNames = new HashSet<>();

        // Insertin
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Wont add this agin
        System.out.println("Set after adds: " + uniqueNames);

        // Removnig "Bob"
        uniqueNames.remove("Bob");
        System.out.println("Set after remove: " + uniqueNames);

        // Serch for "Bob"
        System.out.println("Has Bob? " + uniqueNames.contains("Bob")); // shud be false
        System.out.println("Has Alice? " + uniqueNames.contains("Alice"));

        // Iteration
        System.out.println("Iterating:");
        for (String name : uniqueNames) {
            System.out.println(" - " + name);
        }
    }

    public static void demoHashMap() {
        System.out.println("\n---- Demonstating HahMap ----");
        // HahMap for key-value pares.
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Putiing data in
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 80);
        studentScores.put("Charli", 90); // typo
        System.out.println("Map: " + studentScores);

        // Delte Bob
        studentScores.remove("Bob");
        System.out.println("Map after removing Bob: " + studentScores);

        // Serching... get value by key
        System.out.println("Alices score: " + studentScores.get("Alice"));
        System.out.println("Bob's score: " + studentScores.get("Bob")); // will be null

        // Check for key
        System.out.println("Has Charli? " + studentScores.containsKey("Charli"));

        // Itrate over the map
        System.out.println("Iterating:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(" - " + entry.getKey() + " gotted: " + entry.getValue());
        }
    }
}
