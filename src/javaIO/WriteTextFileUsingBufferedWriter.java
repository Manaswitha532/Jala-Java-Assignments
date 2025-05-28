package javaIO;
//8. Write text to a .txt file using BufferedWriter


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileUsingBufferedWriter {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            // Create FileWriter and wrap it with BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

            // Write lines of text
            bufferedWriter.write("This text is written using BufferedWriter in Java.");
            bufferedWriter.newLine(); // Adds a new line
            bufferedWriter.write("BufferedWriter is efficient for writing text files.");

            System.out.println("Text successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close(); // Close the writer to flush and release resources
                }
            } catch (IOException ex) {
                System.out.println("Error closing BufferedWriter: " + ex.getMessage());
            }
        }
    }
}

