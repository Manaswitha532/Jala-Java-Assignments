package thisAndFinal;
//6. Use this() and super() in methods not in constructors


/*
 *  Invalid Usage Example (Compilation Error):
 * class A {
    A() {
        System.out.println("Parent constructor");
    }
}

class B extends A {
    void display() {
        // this();  ❌ Not allowed
        // super(); ❌ Not allowed
    }
}
*/
class A {
    int num = 10;

    void show() {
        System.out.println("Parent class method");
    }
}

class B extends A {
    int num = 20;

    void display() {
        System.out.println("Child num: " + this.num);   // current class variable
        System.out.println("Parent num: " + super.num); // parent class variable
        super.show();  // call parent method
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

