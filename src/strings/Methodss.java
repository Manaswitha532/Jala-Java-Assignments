package strings;
//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class Methodss {

	public static void main(String[] args) {
		 /*1. equalsIgnoreCase()
		 Use:
		 Compares two strings ignoring case (A = a)
		 Syntax:
		 string1.equalsIgnoreCase(string2)
		 Example:*/
		 String a = "Java";
		 String b = "java";
		 System.out.println(a.equalsIgnoreCase(b));  // true
		 /*🔹 2. startsWith()
		 Use:
		 Checks if a string starts with a specific prefix
		 Syntax:
		 string.startsWith("prefix")
		 Example:*/
		 String name = "Manaswitha";
		 System.out.println(name.startsWith("Manas"));  // true
		 System.out.println(name.startsWith("mana"));   // false
		 /*🔹 3. endsWith()
		 Use:
		 Checks if a string ends with a specific suffix
		 Syntax:
		 string.endsWith("suffix")
		 Example:*/
		 String file = "report.pdf";
		 System.out.println(file.endsWith(".pdf"));   // true
		 System.out.println(file.endsWith(".doc"));   // false
		 /*🔹 4. compareTo()
		 Use:
		 Compares two strings lexicographically (dictionary order).
		 It returns:

		 0 → if both strings are equal

		 < 0 → if first string is smaller

		 > 0 → if first string is greater*/

		 //Syntax:
		 //string1.compareTo(string2)
		 //Example:

		 String a1 = "apple";
		 String b1 = "banana";

		 System.out.println(a1.compareTo(b1));  // -1 or negative (apple < banana)
		 System.out.println(b1.compareTo(a1));  // +1 or positive (banana > apple)
		 System.out.println(a1  .compareTo("apple"));  // 0
	}

}
