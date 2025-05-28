package javaIO;
//3. Read text from a .txt file using BufferedInputStream


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFileUsingBufferedInputStream {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;

        try {
            // Path to your text file
            FileInputStream fileInputStream = new FileInputStream("example.txt");

            // Wrap FileInputStream with BufferedInputStream
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close(); // Close the stream
                }
            } catch (IOException ex) {
                System.out.println("Error closing stream: " + ex.getMessage());
            }
        }
    }
}
