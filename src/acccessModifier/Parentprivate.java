package acccessModifier;
/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.
*/

//Super class with private members
public class Parentprivate {
	
	    private String name = "Manaswitha";
	    private int age = 22;

	    private void showDetails() {
	        System.out.println("Private method: showDetails()");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	    	Parentprivate p = new Parentprivate();
	        System.out.println("Accessing private fields in main method:");
	        System.out.println("Name: " + p.name);     // ✅ OK (same class)
	        System.out.println("Age: " + p.age);       // ✅ OK
	        p.showDetails();                           // ✅ OK
	    }
	}


//Subclass extending Parent
class Child extends Parentprivate {
 void accessParentFields() {
     // The below lines will cause compile-time errors ❌
     // System.out.println(name);       // ❌ private field not accessible
     // System.out.println(age);        // ❌ private field not accessible
     // showDetails();                  // ❌ private method not accessible

     System.out.println("Can't access private members of Parent class");
 }

 public static void main(String[] args) {
     Child c = new Child();
     c.accessParentFields();
 }
}

