package strings;
//13. Converting integer objects to Strings

public class IntegerToString {

	public static void main(String[] args) {
		//Method 1: Using String.valueOf()
		
		Integer num = 123;
		String str = String.valueOf(num);
		System.out.println(str);  // Output: "123"
		
		//Method 2: Using toString() method of Integer
		
		Integer num1 = 456;
		String str1 = num1.toString();
		System.out.println(str1);  // Output: "456"
		
		 //Method 3: Using concatenation with an empty string (+ "")
		 
		 Integer num2 = 789;
		 String str2 = num2 + "";
		 System.out.println(str2);  // Output: "789"

	}

}
