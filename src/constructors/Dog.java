package constructors;
//2. Call the constructors(both default and argument constructors) of super class from a child class

//Superclass
class Animal {
 Animal() {
     System.out.println("Default constructor of Animal");
 }

 Animal(String type) {
     System.out.println("Parameterized constructor of Animal: Type = " + type);
 }
}

//Subclass
class Dog extends Animal {

 // Child class constructor that calls default constructor of parent
 Dog() {
     super(); // Calls Animal()
     System.out.println("Default constructor of Dog");
 }

 // Child class constructor that calls parameterized constructor of parent
 Dog(String breed) {
     super("Mammal"); // Calls Animal(String)
     System.out.println("Parameterized constructor of Dog: Breed = " + breed);
 }

 public static void main(String[] args) {
     System.out.println("----- Calling default constructor -----");
     Dog d1 = new Dog(); // Calls Dog(), which calls Animal()

     System.out.println("----- Calling parameterized constructor -----");
     Dog d2 = new Dog("Labrador"); // Calls Dog(String), which calls Animal(String)
 }
}
