package javaIO;
//7. Read text from a .txt file using BufferedReader


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            // Create FileReader and wrap it with BufferedReader
            bufferedReader = new BufferedReader(new FileReader("C:\\\\Users\\\\MANU\\\\eclipse-workspace\\\\JALA_Java_Assignments\\\\src\\\\example.txt"));

            String line;
            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close(); // Close the BufferedReader
                }
            } catch (IOException ex) {
                System.out.println("Error closing BufferedReader: " + ex.getMessage());
            }
        }
    }
}
