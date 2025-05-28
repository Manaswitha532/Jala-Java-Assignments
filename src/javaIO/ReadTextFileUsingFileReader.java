package javaIO;
//5. Write a program to read text from .txt file using FileReader


import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileUsingFileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            // Create a FileReader for the target file
            fileReader = new FileReader("C:\\Users\\MANU\\eclipse-workspace\\JALA_Java_Assignments\\src\\example.txt");

            int character;
            while ((character = fileReader.read()) != -1) {
                // Print one character at a time
                System.out.print((char) character);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close(); // Close the FileReader
                }
            } catch (IOException ex) {
                System.out.println("Error closing FileReader: " + ex.getMessage());
            }
        }
    }
}
