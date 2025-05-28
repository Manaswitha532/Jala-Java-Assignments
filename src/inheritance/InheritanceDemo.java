package inheritance;
/*now we have to solve this 7. Inheritance
A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
Call an overridden method 4with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members*/



	// Class A (Super class)
	class A {
	    int value = 10;  // Data member

	    void methodA1() {
	        System.out.println("Method A1 from Class A");
	    }

	    void methodA2() {
	        System.out.println("Method A2 from Class A");
	    }

	    void display() {
	        System.out.println("Overridden display() in Class A");
	    }
	}

	// Class B (Subclass of A)
	class B extends A {
	    int value = 20;  // Data member

	    void methodB1() {
	        System.out.println("Method B1 from Class B");
	    }

	    void methodB2() {
	        System.out.println("Method B2 from Class B");
	    }

	    @Override
	    void display() {
	        System.out.println("Overridden display() in Class B");
	    }
	}

	// Class C (Subclass of B)
	class C extends B {
	    int value = 30;  // Data member

	    void methodC1() {
	        System.out.println("Method C1 from Class C");
	    }

	    void methodC2() {
	        System.out.println("Method C2 from Class C");
	    }

	    @Override
	    void display() {
	        System.out.println("Overridden display() in Class C");
	    }
	}

	// Main class
	public class InheritanceDemo {
	    public static void main(String[] args) {
	        // Own objects: calling all methods
	        A objA = new A();
	        System.out.println("--- Object of A ---");
	        objA.methodA1();
	        objA.methodA2();
	        objA.display();

	        B objB = new B();
	        System.out.println("\n--- Object of B ---");
	        objB.methodA1();  // inherited
	        objB.methodA2();  // inherited
	        objB.methodB1();
	        objB.methodB2();
	        objB.display();   // overridden

	        C objC = new C();
	        System.out.println("\n--- Object of C ---");
	        objC.methodA1();  // inherited
	        objC.methodA2();  // inherited
	        objC.methodB1();  // inherited
	        objC.methodB2();  // inherited
	        objC.methodC1();
	        objC.methodC2();
	        objC.display();   // overridden

	        // Superclass references → Runtime Polymorphism
	        A ref;

	        System.out.println("\n--- A reference pointing to B object ---");
	        ref = new B();
	        ref.display();  // Calls B's version due to overriding
	        System.out.println("Value: " + ref.value);  // Shows A's value due to data member hiding

	        System.out.println("\n--- A reference pointing to C object ---");
	        ref = new C();
	        ref.display();  // Calls C's version due to overriding
	        System.out.println("Value: " + ref.value);  // Shows A's value
	        
	    }
	}

