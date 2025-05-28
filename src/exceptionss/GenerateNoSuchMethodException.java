package exceptionss;
//14. Write a program to generate NoSuchMethodException

import java.lang.reflect.Method;

public class GenerateNoSuchMethodException {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Sample.class;

            // Attempt to get a method that does NOT exist in Sample class
            Method method = clazz.getDeclaredMethod("nonExistentMethod");

        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }
}

// Sample class with no method named 'nonExistentMethod'
class Sample {
    public void existingMethod() {
        System.out.println("This method exists.");
    }
}
