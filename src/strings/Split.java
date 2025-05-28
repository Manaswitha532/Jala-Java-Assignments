package strings;
//11. Splitting strings with split()

public class Split {

	public static void main(String[] args) {
		//Split by space
		
		String text = "Java is awesome";
		String[] words = text.split(" ");

		for (String word : words) {
		    System.out.println(word);
		}
		
		//Split by comma
		
		String fruits = "apple,banana,grape";
		String[] items = fruits.split(",");

		for (String item : items) {
		    System.out.println(item);
		}
		
		 //Limit the number of splits

		 String data = "Java-is-easy";
		 String[] parts = data.split("-", 2);

		 System.out.println(parts[0]);  // Java
		 System.out.println(parts[1]);  // is-easy

	}

}
