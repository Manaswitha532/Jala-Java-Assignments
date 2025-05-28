package javaIO;
//2. Write a program to write text to .txt file using OutputStream


import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFileUsingOutputStream {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;

        try {
            // Create or overwrite the file
            outputStream = new FileOutputStream("output.txt");

            String text = "Hello, this text is written using OutputStream in Java.";

            // Convert string to bytes and write to file
            outputStream.write(text.getBytes());

            System.out.println("Text successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close(); // Always close the stream
                }
            } catch (IOException ex) {
                System.out.println("Error closing stream: " + ex.getMessage());
            }
        }
    }
}
