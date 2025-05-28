package interfacess;
//9. Create a PRIVATE or PROTECTED interface and print the values as above scenario



class OuterClass { 
    // Private interface inside OuterClass
    private interface Secret {
        int CODE = 777;  // implicitly public static final
        void reveal();
    }

    // Inner class implementing the private interface
    private class SecretImpl implements Secret {
        public void reveal() {
            System.out.println("Secret code is: " + CODE);
        }
    }

    // Public method to access the private interface
    public void accessSecret() {
        SecretImpl impl = new SecretImpl();
        impl.reveal();
    }
}

public class PrivateInterface {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.accessSecret();
    }
}
