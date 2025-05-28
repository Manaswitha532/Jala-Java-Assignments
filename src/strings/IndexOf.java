package strings;
//5. Searching in strings using indexOf()
public class IndexOf {

	public static void main(String[] args) {
		//str.indexOf(char)           // returns index of first occurrence of the character
		//str.indexOf(String)         // returns index of first occurrence of the substring
		//str.indexOf(char, fromIndex)  // starts searching from a specific position

		//Example 1: Search for a character
	
		String text = "Manaswitha";
		int index = text.indexOf('w');

		System.out.println(index);  // Output: 5
		
		//Example 2: Search for a substring
		
		String sentence = "Learning Java is fun";
		int index1 = sentence.indexOf("Java");

		System.out.println(index1);  // Output: 9
		
		//Search from a specific position
		
		String word = "banana";
		int index2 = word.indexOf('a', 2);

		System.out.println(index2);  // Output: 3 (starts searching from index 2)
		
		// If not found:
		//If the character or substring is not present, it returns -1.

		String name = "Manaswitha";
		System.out.println(name.indexOf('z')); // Output: -1

	}

}
