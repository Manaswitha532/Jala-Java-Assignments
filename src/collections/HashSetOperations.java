package collections;
/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet*/


import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        // 1. Create a HashSet with 10 String elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        fruits.add("Honeydew");
        fruits.add("Kiwi");
        fruits.add("Lemon");

        // 2. Display the HashSet
        System.out.println("Initial HashSet: " + fruits);

        // 3. Add an element (duplicate elements will be ignored)
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate, will not be added
        System.out.println("After adding Mango and duplicate Apple: " + fruits);

        // 4. Remove an element
        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

        // 5. Check if an element exists
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Contains 'Banana'? " + hasBanana);

        // 6. Get the size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // 7. Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Remove all elements
        fruits.clear();
        System.out.println("After clearing all elements: " + fruits);

        // 9. Check if the HashSet is empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());
    }
}
