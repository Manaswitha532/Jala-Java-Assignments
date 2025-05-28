package operatorss;
//Programs on Logical AND,OR operator and Logical NOT
public class logicalOperators {
	    public static void main(String[] args) {
	        boolean a = true;
	        boolean b = false;

	        // Logical AND (&&)
	        System.out.println("a && b: " + (a && b)); // false

	        // Logical OR (||)
	        System.out.println("a || b: " + (a || b)); // true

	        // Logical NOT (!)
	        System.out.println("!a: " + (!a)); // false
	        System.out.println("!b: " + (!b)); // true

	        // Combined condition example
	        int x = 5, y = 10;

	        if (x > 0 && y > 0) {
	            System.out.println("Both x and y are positive");
	        }

	        if (x < 0 || y > 0) {
	            System.out.println("At least one of x or y is positive");
	        }

	        if (!(x > 0)) {
	            System.out.println("x is not positive");
	        } else {
	            System.out.println("x is positive");
	        }
	    }
	}


