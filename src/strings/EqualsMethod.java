package strings;
//7. Comparing strings using the methods equals(), 

public class EqualsMethod {

	public static void main(String[] args) {
		String name1="Manaswitha";
		String name2="Manaswithaa";;
		System.out.println(name1.equals(name2));
		
		// To ignore case
		// You can use .equalsIgnoreCase() if you want to compare strings but ignore capital/small letters:

		 String a = "Java";
		 String b = "java";

		 System.out.println(a.equalsIgnoreCase(b));  // Output: true

	}

}
