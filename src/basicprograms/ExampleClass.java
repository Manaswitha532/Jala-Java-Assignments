//How to create a class, object, method and its signature
package basicprograms;

//Creating a class
public class ExampleClass {
	 // Method
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
	public static void main(String[] args) {
		// Object creation
        ExampleClass obj = new ExampleClass();

        // Method call
        obj.greet("Manaswitha");
	}

}

