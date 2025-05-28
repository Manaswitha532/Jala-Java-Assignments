package exceptionss;
//4. Write a program with multiple catch blocks

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            
            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

            // This will cause ArithmeticException (unreachable here because previous line throws first)
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index accessed.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

