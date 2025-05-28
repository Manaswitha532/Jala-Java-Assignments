package constructors;
//3. Apply private, public, protected and default access modifiers to the constructor
//Class with public constructor


class PublicConstructor {
 public PublicConstructor() {
     System.out.println("Public constructor called");
 }
}

//Class with protected constructor
class ProtectedConstructor {
 protected ProtectedConstructor() {
     System.out.println("Protected constructor called");
 }
}

//Renamed class with default (package-private) constructor
class PackageConstructor {
 PackageConstructor() {
     System.out.println("Default (package-private) constructor called");
 }
}

//Class with private constructor
class PrivateConstructor {
 private PrivateConstructor() {
     System.out.println("Private constructor called");
 }

 // Static factory method to access private constructor
 public static PrivateConstructor getInstance() {
     return new PrivateConstructor();
 }
}
