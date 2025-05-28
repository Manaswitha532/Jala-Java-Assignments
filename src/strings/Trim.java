package strings;
//9. Trimming strings with trim()

public class Trim {

	public static void main(String[] args) {
		String name = "   Manaswitha   ";
		System.out.println("Before trim: '" + name + "'");
		System.out.println("After trim: '" + name.trim() + "'");

		// Not removed: Middle spaces
		
		String str = "  Hello Java  World  ";
		System.out.println(str.trim());  // Output: "Hello Java  World"

	}

}
