package thisAndFinal;
//2. Print the fields/instance members of the parent class using super

	class Parent {
	    int age = 50;
	    String name = "Ravi";
	}

	class Child extends Parent {
	    void displayParentDetails() {
	        System.out.println("Parent Name: " + super.name);
	        System.out.println("Parent Age: " + super.age);
	    }

	    public static void main(String[] args) {
	        Child obj = new Child();
	        obj.displayParentDetails();
	    }
	}
