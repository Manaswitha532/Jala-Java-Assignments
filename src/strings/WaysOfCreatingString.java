package strings;
//1. Different ways creating a string

public class WaysOfCreatingString {

	public static void main(String[] args) {
		//1. Using String Literal
		String s1 = "Hello";
		//2. Using new Keyword
		String s2 = new String("Hello");
		//3. From Character Array
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String s3 = new String(chars);
		//4. From Byte Array
		byte[] bytes = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
		String s4 = new String(bytes);
		//5. Using StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder("Hello");
		String s5 = sb.toString();
		//6. Using String.format()
		//For formatted strings.
		String s6 = String.format("Welcome %s", "Manaswitha");
		//7. Using String.valueOf()
		//Converts primitives or objects to string.
		int num = 100;
		String s7 = String.valueOf(num);
		
		// printing all those
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		

	}

}
