package exceptionss;
//13. Write a program to generate NoSuchFieldException


import java.lang.reflect.Field;

public class GenerateNoSuchFieldException {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Sample.class;

            // Attempt to get a field that does NOT exist in Sample class
            Field field = clazz.getDeclaredField("nonExistentField");

        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }
    }
}

// Sample class with no field named 'nonExistentField'
class Sample {
    private int existingField;
}

