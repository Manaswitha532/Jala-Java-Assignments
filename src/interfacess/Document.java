package interfacess;
//1. Create an interface with only one method and implement it in a class. Call the method implemented.

interface Printable {
    void print();  // abstract method
}
public class Document implements Printable {

    // Implementing the interface method
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    // Main method
    public static void main(String[] args) {
        // Creating object of implementing class
        Document doc = new Document();

        // Calling the implemented method
        doc.print();  // Output: Printing the document...
    }
}

