package strings;
//10. Replacing characters in strings with replace()

public class Replace {

	public static void main(String[] args) {
		 //Replace a character
		 
		 String word = "banana";
		 String result = word.replace('a', 'o');
		 System.out.println(result);  // Output: "bonono"
		 
		 //Replace a word or substring
		 
		 String sentence = "Java is fun";
		 String result2 = sentence.replace("fun", "powerful");
		 System.out.println(result2);  // Output: "Java is powerful"

	}

}
