package basicprograms;
//Define the local and Global variables with the same name and print both variables and
//understand the scope of the variables
public class localGlobalVAr {

		    // Global variable (also called instance variable)
		    int number = 100;

		    public void showValues() {
		        // Local variable with the same name
		        int number = 50;

		        // This will print the local variable
		        System.out.println("Local variable: " + number);

		        // This will print the global variable using 'this' keyword
		        System.out.println("Global variable: " + this.number);
		    }
		    public static void main(String[] args) {
		    	localGlobalVAr obj = new localGlobalVAr();
		        obj.showValues();
		    }
}
