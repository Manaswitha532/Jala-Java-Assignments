package abstractt;
//3. Create an instance for the child class in child class and call abstract methods

//Abstract class
abstract class Shape {

 // Abstract method
 abstract void draw();

 // Non-abstract method
 void display() {
     System.out.println("Displaying shape...");
 }
}
//Child class extending abstract class
class Circle extends Shape {

 // Implementing abstract method
 @Override
 void draw() {
     System.out.println("Drawing a circle.");
 }

 // Method to create an instance and call abstract method
 void performDrawing() {
     // Creating an instance of the same (child) class
     Circle c = new Circle();
     c.draw();     // Calls implemented abstract method
     c.display();  // Optional: also calls non-abstract method from parent
 }

 // Main method
 public static void main(String[] args) {
     // You can also call it from main
     Circle obj = new Circle();
     obj.performDrawing();  // Output: Drawing a circle.
                            //         Displaying shape...
 }
}

