package basicprograms;
//Write a function to print your name and call the function from main method
public class function {
	// Function to print name
    void printMyName() {
        System.out.println("Manaswitha");
    }
	public static void main(String[] args) {
		// Create an object of the class
        function obj = new function();

        // Call the function
        obj.printMyName();

	}

}

