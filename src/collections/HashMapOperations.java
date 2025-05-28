package collections;
/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
*/


import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        // 1. Create a HashMap with 10 key-value pairs (Student ID → Name)
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Heidi");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // 2. Insert a Key-Value mapping into the map
        studentMap.put(111, "Kathy");
        System.out.println("After adding new entry: " + studentMap);

        // 3. Fetch the value of a specific key
        String name = studentMap.get(105);
        System.out.println("Value for key 105: " + name);

        // 4. Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned Map: " + clonedMap);

        // 5. Check if a key exists in the map
        boolean hasKey = studentMap.containsKey(103);
        System.out.println("Contains key 103? " + hasKey);

        // 6. Check if a value exists in the map
        boolean hasValue = studentMap.containsValue("Eve");
        System.out.println("Contains value 'Eve'? " + hasValue);

        // 7. Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // 8. Print the size of the map
        System.out.println("Size of the map: " + studentMap.size());

        // 9. Print all the keys of the map
        System.out.println("Keys in the map: " + studentMap.keySet());

        // 10. Print all the values of the map
        System.out.println("Values in the map: " + studentMap.values());

        // 11. Remove a specific key-value pair
        studentMap.remove(104); // removes key 104 and its value
        System.out.println("After removing key 104: " + studentMap);

        // 12. Copy all elements to another map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Copied map (anotherMap): " + anotherMap);
    }
}
