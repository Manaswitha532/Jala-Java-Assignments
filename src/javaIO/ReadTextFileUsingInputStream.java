package javaIO;
//1. Write a program to read text from .txt file using InputStream


import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFileUsingInputStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            // Provide the path to your .txt file here
            inputStream = new FileInputStream("example.txt");

            int data;
            while ((data = inputStream.read()) != -1) {
                // Read and print one character at a time
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close(); // Always close the stream
                }
            } catch (IOException ex) {
                System.out.println("Error closing stream: " + ex.getMessage());
            }
        }
    }
}