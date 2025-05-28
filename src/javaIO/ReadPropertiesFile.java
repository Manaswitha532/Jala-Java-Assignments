package javaIO;
//9. Write a program to read data from properties file.


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        FileInputStream inputStream = null;

        try {
            // Open the properties file
            inputStream = new FileInputStream("C:\\Users\\MANU\\eclipse-workspace\\JALA_Java_Assignments\\src\\config.properties");

            // Load the properties from the file
            properties.load(inputStream);

            // Access the properties by key
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());

        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close(); // Close the input stream
                }
            } catch (IOException ex) {
                System.out.println("Error closing file: " + ex.getMessage());
            }
        }
    }
}
