package strings;
//12. Converting Numbers to Strings with valueOf()
public class ValueOf {

	public static void main(String[] args) {
		 //Example 1: Convert int to String
		 
		 int number = 100;
		 String str = String.valueOf(number);
		 System.out.println(str + " is now a string");
		 
		 //Example 2: Convert double to String
		 
		 double pi = 3.14159;
		 String result = String.valueOf(pi);
		 System.out.println(result);
		 
		 //Convert boolean to String
		 
		 boolean flag = true;
		 String str1 = String.valueOf(flag);
		 System.out.println(str1);  // Output: true
	}
}
