package javaIO;
//4. Write text to a .txt file using BufferedOutputStream


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFileUsingBufferedOutputStream {
    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream = null;

        try {
            // Create a FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            // Wrap it in a BufferedOutputStream
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // Text to write
            String text = "This text is written using BufferedOutputStream in Java.";

            // Convert text to bytes and write
            bufferedOutputStream.write(text.getBytes());

            // Always flush to ensure data is written to the file
            bufferedOutputStream.flush();

            System.out.println("Text successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close(); // Close the stream
                }
            } catch (IOException ex) {
                System.out.println("Error closing stream: " + ex.getMessage());
            }
        }
    }
}