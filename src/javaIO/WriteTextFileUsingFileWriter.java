package javaIO;
//6. Write a program to write text to .txt file using FileWriter


import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileUsingFileWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            // Create FileWriter (this will overwrite the file if it exists)
            fileWriter = new FileWriter("output.txt");

            String text = "This text is written using FileWriter in Java.";

            // Write text to the file
            fileWriter.write(text);

            System.out.println("Text successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close(); // Close the writer
                }
            } catch (IOException ex) {
                System.out.println("Error closing FileWriter: " + ex.getMessage());
            }
        }
    }
}