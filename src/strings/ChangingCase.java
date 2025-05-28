package strings;
//14. Converting to uppercase and lowercase
public class ChangingCase {

	public static void main(String[] args) {
		//toUpperCase()
		//Converts all letters in a string to uppercase.
		String name = "Manaswitha";
		String upper = name.toUpperCase();
		System.out.println(upper);  // Output: "MANASWITHA"
		
		//toLowerCase()
		//Converts all letters in a string to lowercase.
		String city = "Hyderabad";
		String lower = city.toLowerCase();
		System.out.println(lower);  // Output: "hyderabad"
		
		//Case-insensitive comparison
		String a = "Java";
		String b = "java";
		if (a.toLowerCase().equals(b.toLowerCase())) {
		    System.out.println("Strings are equal (ignoring case)");
		}

	}

}
