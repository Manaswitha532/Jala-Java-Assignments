package thisAndFinal;
//5. Call constructor of the parent class using super()

class Person {
    Person() {
        System.out.println("Parent class constructor called");
    }
}

class Studenttt extends Person {
    Studenttt() {
        super(); // calls the constructor of Person class
        System.out.println("Child class constructor called");
    }

    public static void main(String[] args) {
        Studenttt s = new Studenttt(); // triggers constructor chaining
    }
}


    

