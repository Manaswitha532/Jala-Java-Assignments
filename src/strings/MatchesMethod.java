package strings;
//6. Matching a String Against a Regular Expression With matches()

public class MatchesMethod {

	public static void main(String[] args) {
		String Input1="Manaswitha";
		System.out.println(Input1.matches("[a-zA-Z]+"));
		
		String input2 = "12345";
		boolean result = input2.matches("[0-9]+");
		System.out.println(result);  // Output: true
		
		String email = "manas@example.com";
		boolean valid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
		System.out.println(valid);  // Output: true
		
/*		  Part							Meaning
		  ^								Start of the string
		  [A-Za-z0-9+_.-]+				Username part: letters, digits, +, _, ., or - (1 or more times)
		  @								Must contain an @ symbol
		  [A-Za-z0-9.-]+				Domain part (like gmail.com): letters, digits, . or -
		  $								End of the string
*/
	}

}
