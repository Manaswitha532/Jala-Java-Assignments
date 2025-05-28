package interfacess;
//4. Create two interfaces with one method each. Implement these two interfaces in one class. 

interface Printable {
    void print();
}

interface Showable {
    void show();
}
public class DisplayDocument implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    @Override
    public void show() {
        System.out.println("Showing the document...");
    }

    public static void main(String[] args) {
    	DisplayDocument doc = new DisplayDocument();
        doc.print();  // Output: Printing the document...
        doc.show();   // Output: Showing the document...
    }
}

