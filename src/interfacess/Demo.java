package interfacess;
//3. Use Interface instances to call the implemented method in the implemented class

interface Drawable {
    void draw();  // abstract method
}
class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
public class Demo {
    public static void main(String[] args) {
        // Using interface reference to refer to the implementing class object
        Drawable d = new Circle();

        // Call the implemented method
        d.draw();  // Output: Drawing a circle...
    }
}
