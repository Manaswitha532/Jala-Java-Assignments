package exceptionss;
//11. Write a program to generate FileNotFoundException


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GenerateFileNotFoundException {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            File file = new File("non_existent_file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
