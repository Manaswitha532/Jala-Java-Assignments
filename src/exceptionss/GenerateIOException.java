package exceptionss;
//12. Write a program to generate IOException

import java.io.FileInputStream;
import java.io.IOException;

public class GenerateIOException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("example.txt");
            fis.close();  // Close the stream

            // Attempt to read after stream is closed — causes IOException
            int data = fis.read();  
            System.out.println("Read byte: " + data);

        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}