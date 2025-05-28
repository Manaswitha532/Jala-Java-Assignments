package constructors;
//4. Write constructors with return type int and String

class TestClass {

    // ✅ Constructor (no return type)
    TestClass() {
        System.out.println("Inside constructor");
    }

    // ❌ Not a constructor — this is a method that returns int
    public int TestClass(int x) {
        System.out.println("Inside int-returning method");
        return x;
    }

    // ❌ Not a constructor — this is a method that returns String
    public String TestClass(String msg) {
        System.out.println("Inside String-returning method");
        return msg;
    }
}

