package constructors;
//1. Write a class with a default constructor, one argument constructor and two argument constructors.
// Instantiate the class to call all the constructors of that class from a main class


//Class with default, one-arg, and two-arg constructors
class Book {
 String title;
 double price;

 // Default constructor
 Book() {
     System.out.println("Default constructor called");
 }

 // One-argument constructor
 Book(String title) {
     this.title = title;
     System.out.println("One-argument constructor called");
     System.out.println("Title: " + title);
 }

 // Two-argument constructor
 Book(String title, double price) {
     this.title = title;
     this.price = price;
     System.out.println("Two-argument constructor called");
     System.out.println("Title: " + title + ", Price: ₹" + price);
 }
}

//Main class to invoke all constructors
public class DefaultConstructor {
 public static void main(String[] args) {
     Book b1 = new Book();                            // Calls default constructor
     Book b2 = new Book("Java Programming");          // Calls one-argument constructor
     Book b3 = new Book("Python Basics", 399.99);     // Calls two-argument constructor
 }
}

