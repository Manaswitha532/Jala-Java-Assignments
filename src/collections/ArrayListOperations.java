package collections;
/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList*/


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 1. Create an ArrayList of type String with 10 elements
        ArrayList<String> names = new ArrayList<>();

        // 2. Add 10 elements
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Date");
        names.add("Elderberry");
        names.add("Fig");
        names.add("Grapes");
        names.add("Honeydew");
        names.add("Indian Fig");
        names.add("Jackfruit");

        // 3. Add an element to the ArrayList
        names.add("Kiwi");
        System.out.println("After adding an element: " + names);

        // 4. Iterate through the ArrayList using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 5. Add an element at a specific index
        names.add(2, "Blueberry");
        System.out.println("After adding at index 2: " + names);

        // 6. Remove an element by value
        names.remove("Date");
        System.out.println("After removing 'Date': " + names);

        // 7. Remove an element by index
        names.remove(4);
        System.out.println("After removing element at index 4: " + names);

        // 8. Update the element at a specific index
        names.set(3, "Dragonfruit");
        System.out.println("After updating element at index 3: " + names);

        // 9. Check the element at a particular index
        String elementAt5 = names.get(5);
        System.out.println("Element at index 5: " + elementAt5);

        // 10. Find the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // 11. Check if a specific element exists
        boolean hasKiwi = names.contains("Kiwi");
        System.out.println("Contains 'Kiwi'? " + hasKiwi);

        // 12. Remove all elements
        names.clear();
        System.out.println("After clearing all elements: " + names);
    }
}
